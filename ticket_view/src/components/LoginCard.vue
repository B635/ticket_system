<template>
  <v-content>
    <v-img
        gradient="rgba(0,0,0,.33), rgba(192,192,195,.33)"
        src="@/assets/loginPage.jpeg"
        lazy-src="@/assets/loginPage.jpeg"
        style="height: 100%">
      <v-container fill-height>
        <v-layout align-center justify-center>
          <v-flex md7 sm8 xs12>
            <v-card class="elevation-12" dark>
              <v-toolbar dark>
                <v-spacer style="text-align: center;font-size: 20px;">Fast Ticket</v-spacer>
              </v-toolbar>
              <v-card-text>
                <v-form>
                  <v-text-field
                      v-model="accountInput"
                      label="account"
                      prepend-icon="mdi-account"
                  >
                  </v-text-field>
                  <v-text-field
                      v-model="passwordInput"
                      label="password"
                      prepend-icon="mdi-lock"
                  ></v-text-field>
                </v-form>
              </v-card-text>
              <v-card-actions>
                <SignUpButton/>
                <v-spacer></v-spacer>
                <v-btn
                    @click="verifyAccount()">Sign in
                </v-btn>
              </v-card-actions>
              <v-alert
                  v-model="alert"
                  dismissible
                  elevation="3"
              >账号未注册,请注册账号
              </v-alert>
            </v-card>
          </v-flex>
        </v-layout>
      </v-container>
    </v-img>
  </v-content>
</template>

<script>
import SignUpButton from "../components/SignUpButton"

export default {
  name: "LoginCard",
  components: {
    SignUpButton,
  },
  data: () => ({
    alert: false,
    accountInput: "",
    passwordInput: "",
  }),
  methods: {
    verifyAccount() {
      let url = "http://127.0.0.1:8080/loginIn";
      fetch(url, {
        method: 'post',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify({
          account: this.accountInput,
          password: this.passwordInput,
        })
      })
          .then(r => r.text())
          .then(data => {
            if (data === 'true' || data === 'false') {
              let ls = window.localStorage;
              ls.setItem('is_admin', data);
              ls.setItem('account', this.accountInput);
              this.$router.replace("/home");
            } else if (data === "AccountMissed") {
              this.alert = true
            }
          })
          .catch(e => console.log(e))
    }
  }
}
</script>

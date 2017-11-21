/**
 * Created by macbookpro on 11/15/17.
 */
(function () {
var app = angular.module('myApp', []);
app.controller('myCtrl', myCtrl);

myCtrl.$inject = ['MainService'];
function myCtrl(MainService){

    var vm = this;

    vm.login = login;

    function login(){
        var user = {
            email: vm.email,
            password: vm.password
        };

        try{
            MainService.loginUser(user).then(function successCallBack() {
                console.log("Success!")
            });
        }catch(err){

        }
    }


}

})();

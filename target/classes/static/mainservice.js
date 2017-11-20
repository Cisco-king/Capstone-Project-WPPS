/**
 * Created by macbookpro on 11/15/17.
 */
(function () {

var app = angular.module('myApp');
app.factory('MainService',MainService);

MainService.$inject = ['$http' , '$q'];

function MainService($http,$q) {

    var service = {

        loginUser: function(query){
            var deferred = $q.defer();
            $http.post('/loginUser', query, {
                data: query
            }).then(function (response) {
                deferred.resolve(response.data);
            }, function (response) {
                deferred.reject({
                    message: 'Error to approve request.'
                })
            });
            return deferred.promise;
        }

    };
    return service;
}
})();
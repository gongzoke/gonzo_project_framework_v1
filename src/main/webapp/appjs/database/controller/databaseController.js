const app = angular.module("database", []);
app.controller("databaseController", function($scope, $http) {


    $scope.intiSearch = function (){
        const _param = {
            index: 1,
        }

        $http({
            method: 'POST',
            url: 'database/query.do',
            param: _param,
        }).then(function successCallback(response){

        }).then(function errorCallback(response){

        });


    };














    });
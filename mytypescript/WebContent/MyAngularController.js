/**
 * Created by rumi on 2015-11-01.
 */




var app = angular.module('EricAngularApp', []);



app.controller('myCtrl', function($scope) {
    $scope.nginiteric2=function(){

        document.getElementById("eric").innerHTML="Hello @@@@@ Welcome to angular test";

        return "****Initialized with Angular controller ****";

    };
    $scope.ngchangeeric2=function(){

        document.getElementById("eric").innerHTML=$scope.input_name;

        document.getElementById("eric2").innerHTML=$scope.input_name;
        $scope.eric2=$scope.input_name;

        return true;
    };
});

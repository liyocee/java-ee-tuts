(function(){
    angular.module("raceApp")
    .controller("MainCtrl", ["$scope", "$http",  function($scope, $http){
        $http({
            method: "GET",
            url: "/races"
        }).then(function(response){
            $scope.races = response.data;
        }, function(error){
            console.error("Error fetching races");
        });
    }]);
})();

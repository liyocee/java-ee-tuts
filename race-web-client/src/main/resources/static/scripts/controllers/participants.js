(function(angular){
    angular.module("raceApp")
    .controller("ParticipantsCtrl", ["$scope", "$http", "$routeParams",
        function($scope, $http, $routeParams){
            $http({
                method: "GET",
                url: "/participants/races/"+$routeParams.raceId
            }).then(
                function(response){
                    $scope.participants = response.data;
                },
                function(error){
                    console.log("Error fetching race participants");
                }
            );
        }]);
})(angular)

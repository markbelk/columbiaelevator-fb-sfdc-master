I started with a simple one off worker process.

Link to the documentation is here:
https://devcenter.heroku.com/articles/run-non-web-java-processes-on-heroku

One that was working I added the salesforce maven plugin and attempted to
add dto's by running the following script:

mvn camel-salesforce:generate -DclientId=3MVG9Vik22TUgUphx4WO6gWq2rgnC2MpYc8XzcWW5iQe_PGUVcH02ZX5C708yNoCiv5oR006zITRKffzz_6NX -DclientSecret=489D338A6C04157ADCAD074A267904F5A49DE8846A8A3B22628CDA2366B979C4 -DuserName="nubikadmin@columbia-elevator.com.uat" -Dpassword=Nubik2020!!*

(inlcudes info for the Connected App I created in the Columbia Elevator Sandbox)

I'm having an issue with creating the DTO's which can be duplicated by running the Script.

Once DTO's have been created, the next step is to create a simple route for querying the Account table in Salesforce.
# java-celik-api
Java Wrapper for Čelik API (Serbian ID Card Reader)

## Example Usage

```
CelikApi celikApi = new CelikApiImpl();

celikApi.init(); // Call Only Once

IDInfo idInfo = celikApi.read(); // Read data

celikApi.cleanup(); // Call Only Once

```

## IDInfo Properties

- docRegNo : String
- documentType : String
- issuingDate : String
- expiryDate : String
- issuingAuthority : String
- documentSerialNumberv
- chipSerialNumberv

- personalNumber : String
- surname : String
- givenName : String
- parentGivenName : String
- sex : String
- placeOfBirth : String
- stateOfBirth : String
- dateOfBirth : String
- communityOfBirth : String
- statusOfForeigner : String
- nationalityFull : String

- state : String
- community : String
- place : String
- street : String
- houseNumber : String
- houseLetter : String
- entrance : String
- floor : String
- apartmentNumber : String
- addressDate : String
- addressLabel : String

- portrait : byte[]

---
title: "System::Net::Http::Headers::HttpHeaders klass"
linktitle: "HttpHeaders"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::HttpHeaders klass. Samlingen av HTTP-headers. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 700
url: /sv/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


Samlingen av HTTP-headers. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Validerar ett nytt namn‑värde‑par och lägger till det i den aktuella samlingen. |
| [Add](./add/)(String, String) | Validerar ett nytt namn‑värde‑par och lägger till det i den aktuella samlingen. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Konkatenar den angivna HttpHeaders-klassinstansen med den aktuella. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Hämtar ett huvud med det angivna namnet och lägger till ett parsat värde i huvudet. |
| [Clear](./clear/)() | Tar bort alla objekt från samlingen. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Kontrollerar om huvudet innehåller det angivna värdet. |
| [GetEnumerator](./getenumerator/)() override | Hämtar enumerator. |
| [GetHeaderString](./getheaderstring/)(String) | Returnerar en strängrepresentation av värdena för det angivna huvudnamnet. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Returnerar en strängrepresentation av värdena för det angivna huvudnamnet. |
| [GetHeaderStrings](./getheaderstrings/)() | Returnerar en samling som innehåller strängrepresentationer av huvudens värden. |
| [GetParsedValues](./getparsedvalues/)(String) | Returnerar parsade värden för det angivna huvudnamnet. |
| [GetValues](./getvalues/)(String) | Returnerar motsvarande värden för det angivna namnet. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Konverterar parsade värden till en lista. |
| [Remove](./remove/)(String) | Försöker ta bort ett objekt med det angivna namnet. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Hämtar ett huvud med det angivna namnet och tar bort ett parsat värde från huvudet. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Hämtar ett huvud med det angivna namnet och sätter eller tar bort dess värde. Huvudvärdet kommer att tas bort när parametern 'value' är nullptr, annars kommer ett parsat värde att sättas. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Hämtar ett huvud med det angivna namnet och sätter ett parsat värde i huvudet. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Försöker lägga till ett nytt namn‑värde‑par i den aktuella samlingen. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Lägger till en samling av namn‑värde‑par i den aktuella samlingen. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Försöker hämta motsvarande värden för det angivna namnet. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Försöker tolka det angivna värdet och lägga till det i huvudvärdena. |
## Se även

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)

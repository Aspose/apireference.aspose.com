---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page för C++"
description: "System::Text::RegularExpressions::CaptureCollection-klass. Lista över fångster som görs av en enda fångstgrupp. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 200
url: /sv/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Lista över fångster som görs av en enda fångstgrupp. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Inaktiverar ändring av samlingen. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Tjänstemetod för att lägga till en fångst i samlingen. |
| [Clear](./clear/)() override | Inaktiverar rensning av samlingen. |
| [get_Count](./get_count/)() const override | Hämtar antalet fångster. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Markerar samlingen som skrivskyddad. |
| [get_IsSynchronized](./get_issynchronized/)() const | Markerar samlingen som osynkroniserad. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) åtkomstmetod. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) åtkomstmetod. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) åtkomstmetod. |
| [Remove](./remove/)(const CapturePtr\&) override | Inaktiverar ändring av samlingen. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Base](./base/) | [Base](./base/) typ. |
## Se även

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

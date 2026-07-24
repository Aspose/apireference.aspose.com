---
title: "System::Xml::Schema::XmlSchemaObjectCollection-klass"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection-klass. En samling av XmlSchemaObjects i C++."
type: docs
weight: 5100
url: /sv/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


En samling av XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Lägger till ett [XmlSchemaObject](../xmlschemaobject/) till [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Anger om det specificerade [XmlSchemaObject](../xmlschemaobject/) finns i [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Kopierar alla XmlSchemaObjects från samlingen till den angivna arrayen, med start vid det angivna indexet. |
| [GetEnumerator](./getenumerator/)() override | Returnerar en enumerator för att iterera genom XmlSchemaObjects som finns i [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | Returnerar [XmlSchemaObject](../xmlschemaobject/) på det specificerade indexet. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Ställer in [XmlSchemaObject](../xmlschemaobject/) på det specificerade indexet. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Returnerar samlingens index som motsvarar det specificerade [XmlSchemaObject](../xmlschemaobject/). |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Infogar ett [XmlSchemaObject](../xmlschemaobject/) i [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Tar bort ett [XmlSchemaObject](../xmlschemaobject/) från [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Initierar en ny instans av klassen [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Initierar en ny instans av klassen [XmlSchemaObjectCollection](./) som tar ett [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Anmärkningar



Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig instanser av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

## Se även

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)

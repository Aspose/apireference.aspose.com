---
title: "System::Xml::XmlNamespaceManager klasse"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamespaceManager klasse. Lost, voegt toe en verwijdert namespaces in een collectie en biedt scope-beheer voor deze namespaces in C++."
type: docs
weight: 2300
url: /nl/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Lost namespaces op, voegt ze toe en verwijdert ze uit een verzameling en biedt scope‑beheer voor deze namespaces.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Voegt de opgegeven namespace toe aan de collectie. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Retourneert de namespace-URI voor de standaardnamespace. |
| virtual [get_NameTable](./get_nametable/)() | Retourneert de [XmlNameTable](../xmlnametable/) die aan dit object is gekoppeld. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een enumerator om door de namespaces in de [XmlNamespaceManager](./) te itereren. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Retourneert een collectie van namespace-namen, geïndexeerd op prefix, die kan worden gebruikt om de momenteel in scope zijnde namespaces te enumereren. |
| virtual [HasNamespace](./hasnamespace/)(String) | Retourneert een waarde die aangeeft of de opgegeven prefix een namespace heeft die is gedefinieerd voor de momenteel gepushte scope. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Retourneert de namespace-URI voor de opgegeven prefix. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Vindt de prefix die is gedeclareerd voor de opgegeven namespace-URI. |
| virtual [PopScope](./popscope/)() | Verwijdert een namespace-scope van de stack. |
| virtual [PushScope](./pushscope/)() | Voegt een namespace-scope toe aan de stack. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Verwijdert de opgegeven namespace voor de opgegeven prefix. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuw exemplaar van de klasse [XmlNamespaceManager](./) met de opgegeven [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

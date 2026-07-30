---
title: "classe System::Xml::XPath::XPathExpression"
linktitle: "XPathExpression"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XPath::XPathExpression. Fornisce una classe tipizzata che rappresenta un'espressione XPath compilata in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Fornisce una classe tipizzata che rappresenta un'espressione [XPath](../) compilata.

```cpp
class XPathExpression : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Quando sovrascritto in una classe derivata, ordina i nodi selezionati dall'espressione [XPath](../) secondo l'oggetto IComparer specificato. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Quando sovrascritto in una classe derivata, ordina i nodi selezionati dall'espressione [XPath](../) secondo i parametri forniti. |
| virtual [Clone](./clone/)() | Quando sovrascritto in una classe derivata, restituisce un clone di questo [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | Compila l'espressione [XPath](../) specificata e restituisce un oggetto [XPathExpression](./) che rappresenta l'espressione [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Compila l'espressione [XPath](../) specificata, con l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indicato per la risoluzione dei namespace, e restituisce un oggetto [XPathExpression](./) che rappresenta l'espressione [XPath](../). |
| virtual [get_Expression](./get_expression/)() | Quando sovrascritto in una classe derivata, ottiene una rappresentazione **string** del [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Quando sovrascritto in una classe derivata, ottiene il tipo di risultato dell'espressione [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Quando sovrascritto in una classe derivata, specifica l'oggetto [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) da utilizzare per la risoluzione dei namespace. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Quando sovrascritto in una classe derivata, specifica l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) da utilizzare per la risoluzione dei namespace. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)

---
title: "classe System::Xml::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Page per C++"
description: "classe System::Xml::XmlParserContext. Fornisce tutte le informazioni di contesto necessarie a XmlReader per analizzare un frammento XML in C++."
type: docs
weight: 3000
url: /it/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Fornisce tutte le informazioni di contesto necessarie a [XmlReader](../xmlreader/) per analizzare un frammento XML.

```cpp
class XmlParserContext : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Restituisce l'URI di base. |
| [get_DocTypeName](./get_doctypename/)() | Restituisce il nome della dichiarazione del tipo di documento. |
| [get_Encoding](./get_encoding/)() | Restituisce il tipo di codifica. |
| [get_InternalSubset](./get_internalsubset/)() | Restituisce il sottoinsieme DTD interno. |
| [get_NamespaceManager](./get_namespacemanager/)() | Restituisce il [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | Restituisce il [XmlNameTable](../xmlnametable/) usato per atomizzare le stringhe. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Restituisce l'identificatore pubblico. |
| [get_SystemId](./get_systemid/)() | Restituisce l'identificatore di sistema. |
| [get_XmlLang](./get_xmllang/)() | Restituisce l'ambito **xml:lang** corrente. |
| [get_XmlSpace](./get_xmlspace/)() | Restituisce l'ambito corrente **xml:space**. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Imposta l'URI di base. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Imposta il nome della dichiarazione del tipo di documento. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Imposta il tipo di codifica. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Imposta il sottoinsieme DTD interno. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Imposta il [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Imposta il [XmlNameTable](../xmlnametable/) usato per atomizzare le stringhe. Per ulteriori informazioni sulle stringhe atomizzate, vedere [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Imposta l'identificatore pubblico. |
| [set_SystemId](./set_systemid/)(const String\&) | Imposta l'identificatore di sistema. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Imposta l'ambito **xml:lang** corrente. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Imposta l'ambito **xml:space** corrente. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Inizializza una nuova istanza della classe [XmlParserContext](./) con i [XmlNameTable](../xmlnametable/) e [XmlNamespaceManager](../xmlnamespacemanager/) specificati, e i valori **xml:lang** e **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Inizializza una nuova istanza della classe [XmlParserContext](./) con i [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/) specificati, i valori **xml:lang**, **xml:space**, e la codifica. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Inizializza una nuova istanza della classe [XmlParserContext](./) con i [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/) specificati, l'URI di base, i valori **xml:lang**, **xml:space**, e i valori del tipo di documento. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Inizializza una nuova istanza della classe [XmlParserContext](./) con la [XmlNameTable](../xmlnametable/) specificata, il [XmlNamespaceManager](../xmlnamespacemanager/), l'URI di base, **xml:lang**, **xml:space**, la codifica e i valori del tipo di documento. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

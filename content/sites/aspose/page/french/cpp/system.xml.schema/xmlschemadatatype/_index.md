---
title: "System::Xml::Schema::XmlSchemaDatatype class"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Schema::XmlSchemaDatatype class. La classe XmlSchemaDatatype est une classe abstraite pour la correspondance des types du langage de définition XML Schema (XSD) aux types d'exécution en C++."
type: docs
weight: 2400
url: /fr/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


La classe [XmlSchemaDatatype](./) est une classe abstraite pour la correspondance des types du langage de définition XML [Schema](../) (XSD) aux types d'exécution.

```cpp
class XmlSchemaDatatype : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | Convertit la valeur spécifiée, dont le type est l'une des représentations valides du type de schéma XML représenté par le [XmlSchemaDatatype](./), vers le type d'exécution spécifié. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Convertit la valeur spécifiée, dont le type est l'une des représentations valides du type de schéma XML représenté par le [XmlSchemaDatatype](./), vers le type d'exécution spécifié en utilisant le [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) si le [XmlSchemaDatatype](./) représente le type **xs:QName** ou un type dérivé de celui‑ci. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient le type pour la **string** tel que spécifié dans la spécification World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0. |
| virtual [get_TypeCode](./get_typecode/)() | Renvoie la valeur [XmlTypeCode](../xmltypecode/) du type simple. |
| virtual [get_ValueType](./get_valuetype/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient le type de l'élément. |
| virtual [get_Variety](./get_variety/)() | Renvoie la valeur [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) du type simple. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | Cette méthode renvoie toujours **false**. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | Lorsqu'elle est remplacée dans une classe dérivée, valide la **string** spécifiée contre un type simple intégré ou défini par l'utilisateur. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)

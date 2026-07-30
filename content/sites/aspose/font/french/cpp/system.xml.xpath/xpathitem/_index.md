---
title: "System::Xml::XPath::XPathItem classe"
linktitle: "XPathItem"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathItem classe. Représente un élément du modèle de données XQuery 1.0 et XPath 2.0 en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Représente un élément du XQuery 1.0 et [XPath](../) 2.0 [Data](../../system.data/) modèle.

```cpp
class XPathItem : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient une valeur indiquant si l'élément représente un nœud [XPath](../) ou une valeur atomique. |
| virtual [get_TypedValue](./get_typedvalue/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient l'élément actuel sous forme d'objet empaqueté du type le plus approprié selon son type de schéma. |
| virtual [get_Value](./get_value/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient la valeur **string** de l'élément. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient la valeur de l'élément sous forme de [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'élément en tant que [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'élément en tant que [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'élément en tant que [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'élément en tant que [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient le type de l'élément. |
| virtual [get_XmlType](./get_xmltype/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le XmlSchemaType de l'élément. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Renvoie la valeur de l'élément sous le type spécifié. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Lorsqu'il est remplacé dans une classe dérivée, renvoie la valeur de l'élément sous le type spécifié en utilisant l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)

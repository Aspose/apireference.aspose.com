---
title: "Classe System::Xml::Schema::XmlAtomicValue"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlAtomicValue. Représente la valeur typée d'un élément ou attribut XML validé. La classe XmlAtomicValue ne peut pas être héritée en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Représente la valeur typée d'un élément ou attribut XML validé. La classe [XmlAtomicValue](./) ne peut pas être héritée.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Renvoie une copie de cet objet [XmlAtomicValue](./). |
| [get_IsNode](./get_isnode/)() override | Renvoie une valeur indiquant si l'élément ou attribut XML validé est un nœud [XPath](../../system.xml.xpath/) ou une valeur atomique. |
| [get_TypedValue](./get_typedvalue/)() override | Renvoie l'élément XML ou l'attribut validé actuel sous forme d'objet encapsulé du type le plus approprié selon son type de schéma. |
| [get_Value](./get_value/)() override | Renvoie la valeur [String](../../system/string/) de l'élément XML ou de l'attribut validé. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous forme de [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous forme de [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous forme de [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous forme d'[Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous forme d'[Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Renvoie le type de l'élément XML ou de l'attribut validé. |
| [get_XmlType](./get_xmltype/)() override | Renvoie le [XmlSchemaType](../xmlschematype/) de l'élément XML ou de l'attribut validé. |
| [ToString](./tostring/)() const override | Renvoie la valeur [String](../../system/string/) de l'élément XML ou de l'attribut validé. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Renvoie la valeur de l'élément XML ou de l'attribut validé sous le type spécifié à l'aide de l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

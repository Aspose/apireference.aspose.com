---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs méthode"
linktitle: "ValueAs"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs méthode. Renvoie la valeur de l'élément ou de l'attribut XML validé en tant que type spécifié à l'aide de l'objet IXmlNamespaceResolver indiqué pour résoudre les préfixes d'espace de noms en C++."
type: docs
weight: 1300
url: /fr/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Renvoie la valeur de l'élément ou de l'attribut XML validé en tant que type spécifié à l'aide de l'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indiqué pour résoudre les préfixes d'espace de noms.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| type | const TypeInfo\& | Le type dans lequel renvoyer la valeur de l'élément ou de l'attribut XML validé. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | L'objet [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms. |

### ReturnValue

La valeur de l'élément ou de l'attribut XML validé dans le type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Xml::XPath::XPathNavigator::CheckValidity méthode"
linktitle: "CheckValidity"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity méthode. Vérifie que les données XML dans le XPathNavigator sont conformes au schéma du langage de définition XML Schema (XSD) fourni en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Vérifie que les données XML dans le [XPathNavigator](../) sont conformes au langage de définition du [Schema](../../../system.xml.schema/) XML (XSD) fourni.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | Le XmlSchemaSet contenant les schémas utilisés pour valider les données XML contenues dans le [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | Le ValidationEventHandler qui reçoit des informations sur les avertissements et les erreurs de validation du schéma. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

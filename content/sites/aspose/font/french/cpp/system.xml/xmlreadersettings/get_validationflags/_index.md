---
title: "Méthode System::Xml::XmlReaderSettings::get_ValidationFlags"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags méthode. Retourne une valeur indiquant les paramètres de validation du schéma. Ce paramètre s'applique aux objets XmlReader qui valident les schémas (XmlReaderSettings::get_ValidationType valeur est ValidationType::Schema) en C++."
type: docs
weight: 1800
url: /fr/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Retourne une valeur indiquant les paramètres de validation du schéma. Ce paramètre s'applique aux objets [XmlReader](../../xmlreader/) qui valident les schémas ([XmlReaderSettings::get_ValidationType](../get_validationtype/) valeur est [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Une combinaison binaire de valeurs d'énumération qui spécifient les options de validation. XmlSchemaValidationFlags::ProcessIdentityConstraints et XmlSchemaValidationFlags::AllowXmlAttributes sont activés par défaut. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation et XmlSchemaValidationFlags::ReportValidationWarnings sont désactivés par défaut.

## Voir aussi

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

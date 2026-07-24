---
title: "Método System::Xml::XmlReaderSettings::get_ValidationFlags"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlReaderSettings::get_ValidationFlags. Devuelve un valor que indica la configuración de validación de esquemas. Esta configuración se aplica a objetos XmlReader que validan esquemas (el valor de XmlReaderSettings::get_ValidationType es ValidationType::Schema) en C++."
type: docs
weight: 1800
url: /es/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


Devuelve un valor que indica la configuración de validación de esquemas. Esta configuración se aplica a objetos [XmlReader](../../xmlreader/) que validan esquemas (el valor de [XmlReaderSettings::get_ValidationType](../get_validationtype/) es [ValidationType::Schema](../../validationtype/)).

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

Una combinación bit a bit de valores de enumeración que especifican opciones de validación. XmlSchemaValidationFlags::ProcessIdentityConstraints y XmlSchemaValidationFlags::AllowXmlAttributes están habilitados por defecto. XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation y XmlSchemaValidationFlags::ReportValidationWarnings están deshabilitados por defecto.

## Ver también

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

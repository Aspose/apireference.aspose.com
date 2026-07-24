---
title: "System::Xml::XmlReader::get_SchemaInfo Methode"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlReader::get_SchemaInfo Methode. Gibt die Schema-Informationen zurück, die dem aktuellen Knoten als Ergebnis der Schemavalidierung in C++ zugewiesen wurden."
type: docs
weight: 2200
url: /de/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Gibt die Schemainformation zurück, die dem aktuellen Knoten als Ergebnis der Schema‑Validierung zugewiesen wurde.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Ein IXmlSchemaInfo-Objekt, das die Schema-Informationen für den aktuellen Knoten enthält. [Schema](../../../system.xml.schema/) Informationen können für Elemente, Attribute oder Textknoten mit einem nicht‑null [XmlReader::get_ValueType](../get_valuetype/) Wert festgelegt werden. Wenn der aktuelle Knoten keiner der oben genannten Knotentypen ist oder wenn die [XmlReader](../)-Instanz keine Schema-Informationen meldet, gibt diese Methode **nullptr** zurück. Wird diese Methode von einem [XmlTextReader](../../xmltextreader/) oder einem [XmlValidatingReader](../../xmlvalidatingreader/) Objekt aufgerufen, gibt sie stets **nullptr** zurück. Diese [XmlReader](../)-Implementierungen geben Schema-Informationen nicht über die get_SchemaInfo-Methode frei.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

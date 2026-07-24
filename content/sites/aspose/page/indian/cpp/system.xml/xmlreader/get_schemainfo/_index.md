---
title: "System::Xml::XmlReader::get_SchemaInfo मेथड"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::get_SchemaInfo मेथड। स्कीमा सत्यापन के परिणामस्वरूप वर्तमान नोड को सौंपा गया स्कीमा जानकारी C++ में लौटाता है।"
type: docs
weight: 2200
url: /hi/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


वर्तमान नोड को स्कीमा वैधता के परिणामस्वरूप सौंपा गया स्कीमा जानकारी लौटाता है।

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

वर्तमान नोड के लिए स्कीमा जानकारी युक्त एक IXmlSchemaInfo ऑब्जेक्ट। [Schema](../../../system.xml.schema/) जानकारी को तत्वों, विशेषताओं, या गैर-शून्य [XmlReader::get_ValueType](../get_valuetype/) मान वाले टेक्स्ट नोड्स पर सेट किया जा सकता है। यदि वर्तमान नोड उपरोक्त नोड प्रकारों में से नहीं है, या यदि [XmlReader](../) इंस्टेंस स्कीमा जानकारी नहीं रिपोर्ट करता है, तो यह मेथड **nullptr** लौटाता है। यदि यह मेथड किसी [XmlTextReader](../../xmltextreader/) या [XmlValidatingReader](../../xmlvalidatingreader/) ऑब्जेक्ट से बुलाया जाता है, तो यह हमेशा **nullptr** लौटाता है। ये [XmlReader](../) कार्यान्वयन get_SchemaInfo मेथड के माध्यम से स्कीमा जानकारी उजागर नहीं करते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

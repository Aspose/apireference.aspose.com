---
title: "System::Reflection::PropertyInfo क्लास"
linktitle: "PropertyInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::PropertyInfo क्लास। C++ में प्रॉपर्टी जानकारी का प्रतिनिधित्व करता है।"
type: docs
weight: 1000
url: /hi/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


प्रॉपर्टी जानकारी का प्रतिनिधित्व करता है।

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | [MemberTypes](../membertypes/) मान प्राप्त करता है जो दर्शाता है कि यह सदस्य एक प्रॉपर्टी है। |
| [get_PropertyType](./get_propertytype/)() | प्रॉपर्टी प्रकार प्राप्त करता है। |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | विशिष्ट ऑब्जेक्ट से प्रॉपर्टी मान प्राप्त करता है। |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | विशिष्ट ऑब्जेक्ट से प्रॉपर्टी मान प्राप्त करता है। |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | कंस्ट्रक्टर। केवल const गेटर वाली प्रॉपर्टी। |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | कंस्ट्रक्टर। केवल non-const गेटर वाली प्रॉपर्टी। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | निर्माता। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | कंस्ट्रक्टर। सेट्टर और गेटर वाले [Nullable](../../system/nullable/) प्रॉपर्टी। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | कंस्ट्रक्टर। केवल const गेटर वाला [Nullable](../../system/nullable/) प्रॉपर्टी। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | कंस्ट्रक्टर। केवल गेटर वाला [Object](../../system/object/) प्रॉपर्टी। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | स्ट्रिंग प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | const गेटर वाली क्लास से स्ट्रिंग प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | [Decimal](../../system/decimal/) प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | const गेटर वाली क्लास से [Decimal](../../system/decimal/) प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | बूलियन प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | कॉनस्ट गेटर वाले क्लास से बूलियन प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | int64_t प्रॉपर्टी जानकारी बनाता है। |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | कॉनस्ट गेटर वाले क्लास से int64_t प्रॉपर्टी जानकारी बनाता है। |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | इस प्रॉपर्टी का प्रकार सेट करता है। |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | विशिष्ट ऑब्जेक्ट में प्रॉपर्टी मान सेट करता है। |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | विशिष्ट ऑब्जेक्ट में प्रॉपर्टी मान सेट करता है। |
## संबंधित देखें

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)

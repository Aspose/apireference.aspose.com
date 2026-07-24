---
title: "System::TypeInfo क्लास"
linktitle: "TypeInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::TypeInfo क्लास। C++ में एक विशिष्ट प्रकार का प्रतिनिधित्व करता है और उसके बारे में जानकारी प्रदान करता है।"
type: docs
weight: 6600
url: /hi/cpp/system/typeinfo/
---
## TypeInfo class


एक विशिष्ट प्रकार का प्रतिनिधित्व करता है और उसके बारे में जानकारी प्रदान करता है।

```cpp
class TypeInfo
```

## Nested classes

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | निर्दिष्ट एट्रिब्यूट को प्रकार के एट्रिब्यूट्स की सूची में जोड़ता है। |
| [AddDefaultConstructor](./adddefaultconstructor/)() | प्रकार T के लिए डिफ़ॉल्ट कंस्ट्रक्टर सेट करता है। |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | क्लास इंस्टेंस बनाने वाले फंक्टर द्वारा डिफ़ॉल्ट कंस्ट्रक्टर सेट करता है। |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | निर्दिष्ट सदस्य को प्रकार के सदस्यों की सूची में जोड़ता है। |
| static [BoxedValueType](./boxedvaluetype/)() | कई Boxed* क्लासों द्वारा साझा किए जाने वाले [BoxedValue](./boxedvalue/) प्रकार के लिए अद्वितीय [TypeInfo](./) संरचना प्रदान करता है। |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | लागू नहीं किया गया। वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार के घोषित असेंबली की ओर एक पॉइंटर लौटाता है। |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | लागू नहीं किया गया। वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार का असेंबली नाम सहित पूर्ण योग्य नाम लौटाता है। |
| [get_BaseType](./get_basetype/)() const | बेस टाइप डिस्क्रिप्टर लौटाता है। |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | एक मान प्राप्त करता है जो दर्शाता है कि क्या वर्तमान Type ऑब्जेक्ट में ऐसे टाइप पैरामीटर हैं जिन्हें विशिष्ट टाइप्स द्वारा प्रतिस्थापित नहीं किया गया है। |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | निर्दिष्ट नाम वाले सदस्यों की सूची प्राप्त करता है। |
| [get_FullName](./get_fullname/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार का पूर्ण योग्य नाम (परंतु असेंबली नाम के बिना) लौटाता है। |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | इस प्रकार के लिए जेनेरिक टाइप आर्ग्यूमेंट्स की एक एरे प्राप्त करता है। |
| [get_IsAbstract](./get_isabstract/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार अमूर्त है और उसे ओवरराइड किया जाना चाहिए। |
| [get_IsArray](./get_isarray/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार एक एरे है। |
| [get_IsClass](./get_isclass/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार एक क्लास या डेलीगेट है; अर्थात, यह वैल्यू टाइप या इंटरफ़ेस नहीं है। |
| [get_IsEnum](./get_isenum/)() const | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान प्रकार एक एन्यूमरेशन का प्रतिनिधित्व करता है। |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान प्रकार एक जेनेरिक टाइप डिफिनिशन का प्रतिनिधित्व करता है, जिससे अन्य जेनेरिक टाइप बनाए जा सकते हैं। |
| [get_IsInterface](./get_isinterface/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार एक इंटरफ़ेस है; अर्थात, यह क्लास या वैल्यू टाइप नहीं है। |
| [get_IsSealed](./get_issealed/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार को सील घोषित किया गया है। |
| [get_IsValueType](./get_isvaluetype/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार एक वैल्यू टाइप है। |
| [get_IsVisible](./get_isvisible/)() const | एक मान प्राप्त करता है जो दर्शाता है कि प्रकार को असेंबली के बाहर कोड द्वारा एक्सेस किया जा सकता है। |
| [get_Name](./get_name/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार का नाम लौटाता है। |
| [get_Namespace](./get_namespace/)() const | प्रकार का नेमस्पेस प्राप्त करता है। |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | निर्दिष्ट एरे में प्रकारों से मेल खाने वाले पैरामीटर वाले सार्वजनिक इंस्टेंस कंस्ट्रक्टर की खोज करता है। |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | निर्दिष्ट BindingFlags का उपयोग करके वर्तमान प्रकार के लिए परिभाषित कंस्ट्रक्टर्स की खोज करता है। |
| [GetConstructors](./getconstructors/)() const | वर्तमान प्रकार के लिए परिभाषित सभी सार्वजनिक कंस्ट्रक्टर्स लौटाता है। |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | निर्दिष्ट प्रकार वाले और वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार पर लागू कस्टम एट्रिब्यूट की खोज करता है। |
| [GetCustomAttributes](./getcustomattributes/)() const | एक एरे लौटाता है जिसमें उन ऑब्जेक्ट्स को शामिल किया गया है जो प्रकार पर लागू सभी कस्टम एट्रिब्यूट्स का प्रतिनिधित्व करते हैं। |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | एक एरे लौटाता है जिसमें उन ऑब्जेक्ट्स को शामिल किया गया है जो प्रकार पर लागू विशिष्ट एट्रिब्यूट्स का प्रतिनिधित्व करते हैं। |
| [GetElementType](./getelementtype/)() const | लागू नहीं किया गया। |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | निर्दिष्ट बाइंडिंग प्रतिबंधों का उपयोग करके निर्दिष्ट फ़ील्ड की खोज करता है। |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | निर्दिष्ट बाइंडिंग प्रतिबंधों का उपयोग करके वर्तमान प्रकार के लिए परिभाषित फ़ील्ड्स की खोज करता है। |
| [GetGenericArguments](./getgenericarguments/)() const | इस प्रकार के लिए जेनेरिक टाइप आर्ग्यूमेंट्स की एक एरे प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const | इस इंस्टेंस से जुड़ा हुआ हैश कोड लौटाता है। |
| [GetInterfaces](./getinterfaces/)() const | वर्तमान प्रकार द्वारा लागू या विरासत में प्राप्त सभी इंटरफ़ेस प्राप्त करता है। |
| [GetMember](./getmember/)(const String\&) const | निर्दिष्ट नाम वाले सदस्यों की सूची प्राप्त करता है। |
| [GetMethod](./getmethod/)(const String\&) const | निर्दिष्ट नाम वाले मेथड को प्राप्त करता है। |
| [GetProperties](./getproperties/)() const | वर्तमान प्रकार की सभी सार्वजनिक प्रॉपर्टीज़ लौटाता है। |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | निर्दिष्ट बाइंडिंग प्रतिबंधों का उपयोग करके वर्तमान Type की गुणों की खोज करता है। |
| [GetTemplParamType](./gettemplparamtype/)() const | टेम्प्लेट पैरामीटर प्रकार वर्णनकर्ता प्राप्त करता है। |
| [Hash](./hash/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार से संबंधित हैश मान लौटाता है। |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | निर्धारित करता है कि क्या निर्दिष्ट प्रकार का एक उदाहरण वर्तमान प्रकार के चर को सौंपा जा सकता है। |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | अमल में नहीं। दर्शाता है कि क्या निर्दिष्ट प्रकार या उसके व्युत्पन्न प्रकारों के एक या अधिक गुण इस सदस्य पर लागू होते हैं। |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | निर्धारित करता है कि क्या निर्दिष्ट ऑब्जेक्ट वर्तमान प्रकार का एक उदाहरण है। |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | निर्धारित करता है कि क्या वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया प्रकार निर्दिष्ट वर्ग का उपवर्ग है। |
| [operator!=](./operator!=/)(const TypeInfo\&) const | निर्धारित करता है कि क्या वर्तमान और निर्दिष्ट [TypeInfo](./) ऑब्जेक्ट समान नहीं हैं। |
| [operator!=](./operator!=/)(std::nullptr_t) const | निर्धारित करता है कि क्या वर्तमान [TypeInfo](./) ऑब्जेक्ट शून्य-ऑब्जेक्ट नहीं है, अर्थात यह किसी प्रकार का प्रतिनिधित्व करता है। |
| [operator==](./operator==/)(const TypeInfo\&) const | निर्धारित करता है कि क्या वर्तमान और निर्दिष्ट [TypeInfo](./) ऑब्जेक्ट समान हैं। |
| [operator==](./operator==/)(std::nullptr_t) const | निर्धारित करता है कि क्या वर्तमान [TypeInfo](./) ऑब्जेक्ट शून्य-ऑब्जेक्ट है, अर्थात यह किसी भी प्रकार का प्रतिनिधित्व नहीं करता। |
| [reset](./reset/)() | [TypeInfo](./) को शून्य पर सेट करता है। |
| [set_IsValueType](./set_isvaluetype/)(bool) | एक मान सेट करता है जो दर्शाता है कि Type एक वैल्यू टाइप है या नहीं। |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | बेस टाइप वर्णनकर्ता सेट करता है। |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | टेम्प्लेट पैरामीटर प्रकार वर्णनकर्ता सेट करता है। |
| static [StringHash](./stringhash/)(const char_t *) | निर्दिष्ट स्ट्रिंग के लिए हैश गणना करता है। |
| [ToString](./tostring/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए प्रकार का नाम शामिल करने वाली स्ट्रिंग लौटाता है। |
| static [Type](./type/)() | एक [TypeInfo](./) ऑब्जेक्ट लौटाता है जो [TypeInfo](./) क्लास का प्रतिनिधित्व करता है। |
| [TypeInfo](./typeinfo/)() | डिफ़ॉल्ट कंस्ट्रक्टर (कोई प्रकार सेट नहीं है)। |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | नल ऑब्जेक्ट कंस्ट्रक्टर (कोई प्रकार सेट नहीं है)। |
| [TypeInfo](./typeinfo/)(const char_t *) | निर्माता। |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | निर्माता। |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [EmptyType](./emptytype/) | [TypeInfo](./) की खाली सूची का प्रतिनिधित्व करने वाला स्थिरांक। |
| static [EmptyTypes](./emptytypes/) | [TypeInfo](./) की खाली सूची का प्रतिनिधित्व करने वाला स्थिरांक। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | प्रकार बनाने के लिए फ़ंक्शन पॉइंटर। |
## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

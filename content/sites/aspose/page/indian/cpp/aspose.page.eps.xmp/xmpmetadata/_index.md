---
title: "Aspose::Page::EPS::XMP::XmpMetadata क्लास"
linktitle: "XmpMetadata"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::XMP::XmpMetadata क्लास। C++ में XMP मेटाडेटा स्ट्रीम तक पहुँच प्रदान करता है।"
type: docs
weight: 200
url: /hi/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


[XMP](../) मेटाडेटा स्ट्रीम तक पहुँच प्रदान करता है।

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | मेटाडेटा में मान जोड़ता है। |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | मेटाडेटा में मान जोड़ता है। |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | डिक्शनरी में कुंजी और मान के साथ जोड़ी जोड़ता है। |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | एक एरे में मान जोड़ता है। मान एरे के अंत में जोड़ा जाएगा। |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | निर्दिष्ट सूचकांक द्वारा एरे में मान जोड़ता है। |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | संरचना में नामित मान जोड़ता है। |
| [Clear](./clear/)() override | मेटाडेटा साफ़ करता है। |
| [Contains](./contains/)(const System::String\&) const | जाँचता है कि कुंजी मेटाडेटा में मौजूद है या नहीं। |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | जाँचता है कि निर्दिष्ट कुंजी-मान जोड़ी डिक्शनरी में मौजूद है या नहीं। |
| [ContainsKey](./containskey/)(const System::String\&) const override | निर्धारित करता है कि यह डिक्शनरी निर्दिष्ट कुंजी रखती है या नहीं। |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | संग्रह के तत्वों को एरे में कॉपी करता है। |
| [get_Count](./get_count/)() const override | संग्रह में तत्वों की गिनती प्राप्त करता है। |
| [get_IsFixedSize](./get_isfixedsize/)() const | जाँचता है कि संग्रह का आकार स्थिर है या नहीं। |
| [get_IsReadOnly](./get_isreadonly/)() const override | जाँचता है कि संग्रह केवल-पढ़ने योग्य है या नहीं। |
| [get_IsSynchronized](./get_issynchronized/)() | जाँचता है कि संग्रह समकालिक है या नहीं। |
| [get_Keys](./get_keys/)() const override | मेटाडेटा कुंजियों का संग्रह प्राप्त करता है। |
| [get_NamespaceManager](./get_namespacemanager/)() | नेमस्पेस प्रबंधक प्राप्त करता है। |
| [get_SyncRoot](./get_syncroot/)() const | संग्रह समकालिकता वस्तु प्राप्त करता है। |
| [get_Values](./get_values/)() const override | मेटाडेटा में मान प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | डिक्शनरी एन्यूमरेटर लौटाता है। |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | उपसर्ग द्वारा नेमस्पेस URI लौटाता है। |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | नामस्थान URI द्वारा उपसर्ग लौटाता है। |
| [idx_get](./idx_get/)(const System::String\&) const override | मेटाडेटा से डेटा प्राप्त करता है। |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | मेटाडेटा से डेटा सेट करता है। |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | नामस्थान URI को पंजीकृत करता है। |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | नामस्थान URI को पंजीकृत करता है। |
| [Remove](./remove/)(const System::String\&) override | मेटाडेटा से प्रविष्टि हटाता है। |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | संग्रह से कुंजी/मान जोड़ी हटाता है। |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | एक एरे में मान सेट करता है। पिछला मान नई मान से प्रतिस्थापित किया जाएगा। |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | एक संरचना में नामित मान सेट करता है। यदि पहले से मौजूद है तो पिछला नामित मान नई मान से प्रतिस्थापित होगा। |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | डिक्शनरी में कुंजी खोजने का प्रयास करता है और यदि मिलती है तो मान प्राप्त करता है। |
## संबंधित देखें

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)

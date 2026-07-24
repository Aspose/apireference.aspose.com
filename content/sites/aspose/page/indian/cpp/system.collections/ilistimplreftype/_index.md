---
title: "System::Collections::IListImplRefType क्लास"
linktitle: "IListImplRefType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::IListImplRefType क्लास। C++ में रेफ़रेंस टाइप्स के लिए System::Collections::Generic::List ऑब्जेक्ट पर System::Collections::IList इंटरफ़ेस को लागू करने वाला स्टब।"
type: docs
weight: 1100
url: /hi/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


[System::Collections::IList](../ilist/) इंटरफ़ेस को [System::Collections::Generic::List](../../system.collections.generic/list/) ऑब्जेक्ट पर लागू करने वाला स्टब। रेफ़रेंस टाइप्स के लिए कार्यान्वयन।

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | सूची के अंत में तत्व जोड़ता है। |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | टाइप रेफ़रेंस को ऑब्जेक्ट वैल्यू में बदलना। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | जाँचता है कि आइटम सूची में मौजूद है या नहीं। |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) मेथड्स कार्यान्वयन संग्रह में तत्वों की संख्या प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) कार्यान्वयन एक एनेमरेटर लौटाता है जो संग्रह के माध्यम से इटररेट करता है। |
| [idx_get](./idx_get/)(int, int) const override | निर्दिष्ट इंडेक्स पर तत्व प्राप्त करता है। |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | नया ऑब्जेक्ट इंस्टेंस बनाता है। |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | कंटेनर में आइटम की पहली उपस्थिति का इंडेक्स प्राप्त करता है। |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | निर्दिष्ट स्थिति में तत्व डालता है, अन्य तत्वों को शिफ्ट करता है। |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | सूची से विशिष्ट आइटम का पहला उदाहरण हटाता है। |
| [RemoveAt](./removeat/)(int) override | निर्दिष्ट स्थिति पर आइटम हटाता है। |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | ऑब्जेक्ट वैल्यू को विशिष्ट टाइप रेफ़रेंस में बदलना। |
## संबंधित देखें

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

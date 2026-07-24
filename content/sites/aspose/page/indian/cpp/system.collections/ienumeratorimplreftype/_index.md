---
title: "System::Collections::IEnumeratorImplRefType क्लास"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::IEnumeratorImplRefType क्लास। रैपर जो जेनरिक नहीं होने वाले IEnumerator कार्यान्वयन को जेनरिक Iterator IEnumeratorImplRefType के ऊपर बनाता है - C++ में रेफ़रेंस टाइप्स के लिए रैपर।"
type: docs
weight: 700
url: /hi/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


रैपर जो जेनरिक नहीं होने वाले [IEnumerator](../ienumerator/) कार्यान्वयन को जेनरिक Iterator [IEnumeratorImplRefType](./) के ऊपर बनाता है - रेफ़रेंस टाइप्स के लिए रैपर।

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Current](./get_current/)() const override | वर्तमान तत्व प्राप्त करता है। |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | रैपर कन्स्ट्रक्टर |
| [MoveNext](./movenext/)() override | एनेमरेटर को अगले तत्व पर ले जाता है। यदि पहले कोई तत्व संदर्भित नहीं था, तो उपलब्ध पहले तत्व को संदर्भित करता है। यदि कंटेनर के अंत तक पहुँचा गया, तो कुछ नहीं करता। |

## संबंधित देखें

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

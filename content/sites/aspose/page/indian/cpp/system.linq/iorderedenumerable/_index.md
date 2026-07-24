---
title: "System::Linq::IOrderedEnumerable क्लास"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Linq::IOrderedEnumerable क्लास। C++ में एक क्रमबद्ध अनुक्रम का प्रतिनिधित्व करता है।"
type: docs
weight: 300
url: /hi/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


एक क्रमबद्ध अनुक्रम का प्रतिनिधित्व करता है।

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | अनुक्रम के तत्वों का प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर प्राप्त करता है। |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | एक कुंजी के अनुसार अनुक्रम में तत्वों को आरोही क्रम में आगे क्रमबद्ध करता है। |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Comparator](./comparator/) | RTTI जानकारी। |

## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::EnumeratorWrapperIterator क्लास"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::EnumeratorWrapperIterator क्लास। वह इटेरेटर जो पूर्व-निर्मित एनेमरेटर को लपेटता है और सभी कॉल्स को C++ में उसमें पुनर्निर्देशित करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


इटररेटर जो पूर्व-निर्मित एनेमरेटर को लपेटता है और सभी कॉल्स को उसमें पुनर्निर्देशित करता है।

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| पैरामीटर | विवरण |
| --- | --- |
| Element | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | इटेरेटर को एक कदम आगे ले जाता है। m_is_end और m_pointer को अपडेट करना आवश्यक है। |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | जाँचता है कि दो इटेरेटर एक ही आइटम की ओर संकेत कर रहे हैं या नहीं। |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

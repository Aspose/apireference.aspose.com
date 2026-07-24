---
title: "System::Collections::IList क्लास"
linktitle: "IList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::IList क्लास। IList एक गैर-जनरिक ऑब्जेक्ट्स का संग्रह दर्शाता है जिसे C++ में इंडेक्स द्वारा व्यक्तिगत रूप से एक्सेस किया जा सकता है।"
type: docs
weight: 1000
url: /hi/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | सूची के अंत में आइटम जोड़ता है। |
| virtual [Clear](./clear/)() | सूची से सभी आइटम हटाता है। |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | जाँचता है कि आइटम सूची में है या नहीं। |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | एक मान प्राप्त करता है जो दर्शाता है कि सूची का आकार निश्चित है या नहीं। |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI जानकारी। |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | निर्दिष्ट आइटम का पहला इंडेक्स प्राप्त करता है। |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | निर्दिष्ट इंडेक्स पर सूची में आइटम सम्मिलित करता है। |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | सूची से निर्दिष्ट आइटम की पहली घटना हटाता है। |
| virtual [RemoveAt](./removeat/)(int) | निर्दिष्ट इंडेक्स पर सूची से आइटम हटाता है। |
## संबंधित देखें

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

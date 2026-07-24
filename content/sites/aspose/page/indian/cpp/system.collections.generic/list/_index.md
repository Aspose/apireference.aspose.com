---
title: "System::Collections::Generic::List क्लास"
linktitle: "सूची"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::List क्लास। C++ में List का अग्र घोषणा।"
type: docs
weight: 3300
url: /hi/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ विशिष्ट। |
| [Add](./add/)(const T\&) override | सूची के अंत में तत्व जोड़ता है। |
| [AddInitializer](./addinitializer/)(int, const T *) | सूची में तत्व जोड़ता है; प्रारम्भिक मानों का अनुवाद करते समय उपयोग किया जाता है। |
| [AddRange](./addrange/)(IEnumerablePtr) | संग्रह (या स्वयं) से सभी तत्व वर्तमान सूची के अंत में जोड़ता है। |
| [AsReadOnly](./asreadonly/)() | इस संग्रह का केवल-पढ़ने योग्य रेफ़रेंस प्राप्त करता है। |
| [begin](./begin/)() | संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [begin](./begin/)() const | स्थिर-योग्य संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [BinarySearch](./binarysearch/)(const T\&) const | सॉर्टेड सूची में आइटम की खोज करता है। |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | सॉर्टेड सूची में आइटम की खोज करता है। |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | सॉर्टेड सूची में आइटम की खोज करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंत के पीछे मौजूद न होने वाले const-योग्य तत्व के लिए इटररेटर प्राप्त करता है। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि आइटम सूची में मौजूद है या नहीं। |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | विभिन्न प्रकार में परिवर्तित तत्वों की सूची बनाता है। |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | सूची के तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | सभी तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | निर्दिष्ट इंडेक्स से शुरू होकर तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| [crbegin](./crbegin/)() const | संग्रह के अंतिम const-योग्य तत्व के लिए एक रिवर्स इटरेटर प्राप्त करता है (रिवर्स में पहला)। |
| [crend](./crend/)() const | संग्रह की शुरुआत से पहले एक गैर-मौजूद const-योग्य तत्व के लिए रिवर्स इटरेटर प्राप्त करता है। |
| [data](./data/)() | आधारभूत डेटा संरचना पहुँच फ़ंक्शन। |
| [data](./data/)() const | आधारभूत डेटा संरचना पहुँच फ़ंक्शन। |
| [end](./end/)() | संग्रह के अंत के पीछे मौजूद न होने वाले तत्व के लिए इटररेटर प्राप्त करता है। |
| [end](./end/)() const | const-योग्य संग्रह के अंत के पीछे मौजूद न होने वाले तत्व के लिए इटररेटर प्राप्त करता है। |
| [Exists](./exists/)(System::Predicate\<T\>) | जाँचता है कि क्या सूची में विशिष्ट प्रेडिकेट को पूरा करने वाला तत्व मौजूद है। |
| [Find](./find/)(System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले तत्व की तलाश करता है। |
| [FindAll](./findall/)(System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले तत्वों की तलाश करता है। |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले तत्व की तलाश करता है। |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले तत्व की तलाश करता है। |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले तत्व की तलाश करता है। |
| [FindLast](./findlast/)(System::Predicate\<T\>) | विशिष्ट प्रेडिकेट को पूरा करने वाले अंतिम तत्व की तलाश करता है। |
| [ForEach](./foreach/)(System::Action\<T\>) | सूची के सभी तत्वों पर क्रिया लागू करता है। |
| [get_Capacity](./get_capacity/)() const | वर्तमान सूची क्षमता प्राप्त करता है। |
| [get_Count](./get_count/)() const override | वर्तमान सूची में तत्वों की संख्या प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | सूची के तत्वों के माध्यम से इटररेट करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [GetRange](./getrange/)(int, int) | सूची का स्लाइस बनाता है। |
| [idx_get](./idx_get/)(int) const override | निर्दिष्ट स्थिति पर तत्व प्राप्त करता है। |
| [idx_set](./idx_set/)(int, T) override | निर्दिष्ट स्थिति पर तत्व को सेट करता है। |
| [IndexOf](./indexof/)(const T\&) const override | विशिष्ट आइटम का पहला इंडेक्स प्राप्त करता है। |
| [IndexOf](./indexof/)(const T\&, int) const | सूची में विशिष्ट आइटम की तलाश करता है। |
| [Insert](./insert/)(int, const T\&) override | निर्दिष्ट स्थिति पर आइटम सम्मिलित करता है। |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | निर्दिष्ट स्थिति पर डेटा रेंज सम्मिलित करता है। |
| [LastIndexOf](./lastindexof/)(const T\&) const | निर्दिष्ट ऑब्जेक्ट की खोज करता है और पूरी सूची में अंतिम आवृत्ति का शून्य-आधारित इंडेक्स लौटाता है। |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | निर्दिष्ट ऑब्जेक्ट की खोज करता है और पहले तत्व से लेकर निर्दिष्ट इंडेक्स तक विस्तारित [List](./) के तत्वों की रेंज में अंतिम आवृत्ति का शून्य-आधारित इंडेक्स लौटाता है। |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | निर्दिष्ट वस्तु की खोज करता है और [List](./) में तत्वों की सीमा के भीतर अंतिम प्रकट होने का शून्य-आधारित सूचकांक लौटाता है, जिसमें निर्दिष्ट संख्या के तत्व होते हैं और निर्दिष्ट सूचकांक पर समाप्त होता है. |
| [List](./list/)() | खाली सूची बनाता है. |
| [List](./list/)(int) | पूर्व-परिभाषित क्षमता के साथ सूची बनाता है. |
| [List](./list/)(IEnumerablePtr) | कॉपी कंस्ट्रक्टर। |
| [operator[]](./operator[]/)(int) | एक्सेसर फ़ंक्शन। |
| [operator[]](./operator[]/)(int) const | एक्सेसर फ़ंक्शन। |
| [rbegin](./rbegin/)() | कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() const | कॉन्स्ट-योग्य कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [Remove](./remove/)(const T\&) override | सूची से विशिष्ट आइटम का पहला उदाहरण हटाता है। |
| [RemoveAll](./removeall/)(Predicate\<T\>) | विशिष्ट प्रेडिकेट से मेल खाने वाले सभी तत्वों को हटाता है. |
| [RemoveAt](./removeat/)(int) override | निर्दिष्ट स्थिति पर आइटम हटाता है। |
| [RemoveRange](./removerange/)(int, int) | सूची के स्लाइस को हटाता है. |
| [rend](./rend/)() | कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() const | कॉन्स्ट-योग्य कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [Reverse](./reverse/)() | पूरी सूची के तत्वों के क्रम को उलटता है. |
| [Reverse](./reverse/)(int, int) | सूची स्लाइस के तत्वों के क्रम को उलटता है. |
| [set_Capacity](./set_capacity/)(int) | सूची की क्षमता सेट करता है. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | सूची में तत्वों को क्रमबद्ध करता है. |
| [Sort](./sort/)() | डिफ़ॉल्ट तुलना करने वाले का उपयोग करके सूची में तत्वों को क्रमबद्ध करता है. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | सूची स्लाइस में तत्वों को क्रमबद्ध करता है. |
| [Sort](./sort/)(Comparison\<T\>, bool) | सूची में तत्वों को क्रमबद्ध करता है. |
| [ToArray](./toarray/)() const | सूची को एरे में बदलता है. |
| [TrimExcess](./trimexcess/)() | सूची की क्षमता को उसके आकार के अनुसार बनाता है. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | निर्धारित करता है कि संग्रह में प्रत्येक तत्व निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों से मेल खाता है या नहीं. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इंटरफ़ेस प्रकार. |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [const_reverse_iterator](./const_reverse_iterator/) | कॉन्स्ट रिवर्स इटररेटर प्रकार। |
| [IEnumerablePtr](./ienumerableptr/) | एक कंटेनर जो समान प्रकार के तत्वों को रखता है. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
| [ValueType](./valuetype/) | यह प्रकार। |
| [vector_t](./vector_t/) | RTTI जानकारी। |
## टिप्पणियाँ


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // पहली सूची बनाएं.
  auto list1 = MakeObject<List<int>>();

  // पहली सूची को भरें.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // पहली सूची को क्रमबद्ध करें.
  // पहली सूची के आइटम होंगे: {-5, 1, 3, 8}.
  list1->Sort();

  // सूचकांक 2 पर आइटम हटाएँ.
  // पहली सूची के आइटम होंगे: {-5, 1, 8}.
  list1->RemoveAt(2);

  // सूचकांक 1 पर आइटम डालें.
  // पहली सूची के आइटम होंगे: {-5, 15, 1, 8}.
  list1->Insert(1, 15);

  // दूसरी सूची बनाएं.
  auto list2 = MakeObject<List<int>>();

  // दूसरी सूची भरें।
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // दूसरी सूची के तत्वों को पहली सूची में जोड़ें।
  list1->AddRange(list2);

  // पहली सूची के आइटम प्रिंट करें।
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

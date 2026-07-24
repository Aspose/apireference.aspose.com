---
title: "System::Windows::Forms::Control::ControlCollection क्लास"
linktitle: "ControlCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Windows::Forms::Control::ControlCollection क्लास. नियंत्रणों का संग्रह. C++ में लागू नहीं है।"
type: docs
weight: 200
url: /hi/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


नियंत्रणों का संग्रह. लागू नहीं है।

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | संग्रह में नियंत्रण जोड़ता है। |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | संग्रह में कई नियंत्रण जोड़ता है। |
| [Clear](./clear/)() override | संग्रह से सभी नियंत्रण हटाता है। |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | जाँचता है कि क्या विशिष्ट नियंत्रण संग्रह में मौजूद है। |
| virtual [ContainsKey](./containskey/)(System::String) const | जाँचता है कि क्या विशिष्ट नाम वाला नियंत्रण संग्रह में मौजूद है। |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | निर्माता। |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | संग्रह की सामग्री को मौजूदा एरे तत्वों में कॉपी करता है। |
| [Find](./find/)(const System::String\&, bool) const | संग्रह में नामित नियंत्रण को खोजता है। वैकल्पिक रूप से शामिल नियंत्रणों के संग्रहों को पुनरावर्ती रूप से जाँचता है। |
| [get_Count](./get_count/)() const override | संग्रह में नियंत्रणों की संख्या प्राप्त करता है। |
| [get_Owner](./get_owner/)() const | संग्रह के मालिक नियंत्रण को प्राप्त करता है। |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | विशिष्ट नियंत्रण को खोजता है। |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | विशिष्ट नियंत्रण को खोजता है। |
| [GetEnumerator](./getenumerator/)() override | संग्रह के माध्यम से पुनरावृत्ति करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const override | इंडेक्स द्वारा अभिगमकर्ता। |
| virtual [idx_get](./idx_get/)(System::String) const | नाम-आधारित अभिगमकर्ता। |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | इंडेक्स द्वारा अभिगमकर्ता। |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | नाम-आधारित अभिगमकर्ता। |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | संग्रह में नियंत्रण की खोज करता है। |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | संग्रह में नामित नियंत्रण की खोज करता है। |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | नियंत्रण को संग्रह में सम्मिलित करता है। |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | संग्रह से नियंत्रण को हटाता है। |
| [RemoveAt](./removeat/)(int) override | संग्रह से नियंत्रण को हटाता है। |
| virtual [RemoveByKey](./removebykey/)(System::String) | संग्रह से नियंत्रण को हटाता है। |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | नियंत्रण को नई स्थिति में ले जाता है। |
## संबंधित देखें

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)

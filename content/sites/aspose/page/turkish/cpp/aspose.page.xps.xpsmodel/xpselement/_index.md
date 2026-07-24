---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. C++'de ortak XPS öğesi özelliklerini kapsayan sınıf."
type: docs
weight: 900
url: /tr/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Ortak [XPS](../../aspose.page.xps/) öğesi özelliklerini kapsayan sınıf.

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() | Koleksiyonun (varsa) ilk öğesine işaret eden yineleyiciyi alır. |
| [begin](./begin/)() const | Koleksiyonun const nitelikli örneğinin (varsa) ilk öğesine işaret eden yineleyiciyi alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun (varsa) ilk const nitelikli öğesine işaret eden yineleyiciyi alır. |
| [cend](./cend/)() const | Koleksiyonun (varsa) son const nitelikli öğesinden hemen sonra işaret eden yineleyiciyi alır. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Koleksiyonun (varsa) son öğesinden hemen sonrasını gösteren yineleyiciyi alır. |
| [end](./end/)() const | Koleksiyonun const nitelikli örneğinin (varsa) son öğesinden hemen sonrasını gösteren yineleyiciyi alır. |
| [get_Count](./get_count/)() | Alt öğelerin sayısını döndürür. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) arayüzünün uygulanması. |
| [idx_get](./idx_get/)(int32_t) | Elemanın çocuklarına *i* indeksiyle erişim sağlar. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Koleksiyonun const nitelikli örneğinin (varsa) ilk öğesini gösteren yineleyiciyi alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Koleksiyonun (varsa) ilk öğesine işaret eden yineleyiciyi alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Koleksiyonun const nitelikli örneğinin (varsa) son öğesinden hemen sonrasını gösteren yineleyiciyi alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Koleksiyonun (varsa) son öğesinden hemen sonrasını gösteren yineleyiciyi alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [iterator](./iterator/) | Yineleyici türü. |
| [iterator_holder_type](./iterator_holder_type/) | Geçerli koleksiyonda yineleyici türleri olarak kullanılan bir koleksiyon türü. |
| [virtualized_iterator](./virtualized_iterator/) | Sanallaştırılmış tür. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Sanallaştırılmış öğe türü. |
## Ayrıca Bakınız

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

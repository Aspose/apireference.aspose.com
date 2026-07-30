---
title: "System::Windows::Forms::Control::ControlCollection sınıfı"
linktitle: "ControlCollection"
second_title: "Aspose.Font için C++"
description: "System::Windows::Forms::Control::ControlCollection sınıfı. Kontrollerin koleksiyonu. C++'ta uygulanmamıştır."
type: docs
weight: 200
url: /tr/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Kontrollerin koleksiyonu. Uygulanmadı.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Koleksiyona kontrol ekler. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Koleksiyona birden fazla kontrol ekler. |
| [Clear](./clear/)() override | Koleksiyondan tüm kontrolleri siler. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Koleksiyonda belirli bir kontrolün mevcut olup olmadığını denetler. |
| virtual [ContainsKey](./containskey/)(System::String) const | Koleksiyonda belirli bir ada sahip kontrolün mevcut olup olmadığını denetler. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Yapıcı. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Koleksiyon içeriğini mevcut dizi öğelerine kopyalar. |
| [Find](./find/)(const System::String\&, bool) const | Koleksiyonda adlandırılmış kontrolü arar. İsteğe bağlı olarak, içerilen kontrollerin koleksiyonlarını yinelemeli olarak denetler. |
| [get_Count](./get_count/)() const override | Koleksiyondaki kontrol sayısını alır. |
| [get_Owner](./get_owner/)() const | Koleksiyonun sahibi kontrolü alır. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Belirli bir kontrolü arar. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Belirli bir kontrolü arar. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon içinde yineleme yapmak için döngüleyiciyi alır. |
| [idx_get](./idx_get/)(int) const override | Indeks ile erişim. |
| virtual [idx_get](./idx_get/)(System::String) const | İsim ile erişim. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Indeks ile erişim. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | İsim ile erişim. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Koleksiyonda kontrolü arar. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Koleksiyonda adlandırılmış kontrolü arar. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Kontrolü koleksiyona ekler. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Kontrolü koleksiyondan kaldırır. |
| [RemoveAt](./removeat/)(int) override | Kontrolü koleksiyondan kaldırır. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Kontrolü koleksiyondan kaldırır. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Kontrolü yeni bir konuma taşır. |
## Ayrıca Bakınız

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Font for C++](../../../)

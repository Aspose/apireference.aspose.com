---
title: "System::Windows::Forms::Control::ControlCollection sınıfı"
linktitle: "ControlCollection"
second_title: "Aspose.Page için C++"
description: "System::Windows::Forms::Control::ControlCollection sınıfı. Kontrollerin koleksiyonu. C++'da uygulanmamış."
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
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Kontrolü koleksiyona ekler. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Birden fazla kontrolü koleksiyona ekler. |
| [Clear](./clear/)() override | Koleksiyondaki tüm kontrolleri siler. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Belirli bir kontrolün koleksiyonda bulunup bulunmadığını denetler. |
| virtual [ContainsKey](./containskey/)(System::String) const | Belirli bir ada sahip kontrolün koleksiyonda bulunup bulunmadığını denetler. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Yapıcı. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Koleksiyon içeriğini mevcut dizi elemanlarına kopyalar. |
| [Find](./find/)(const System::String\&, bool) const | Koleksiyonda adlandırılmış kontrolü arar. İsteğe bağlı olarak içerilen kontrollerin koleksiyonlarını yinelemeli olarak denetler. |
| [get_Count](./get_count/)() const override | Koleksiyondaki kontrol sayısını alır. |
| [get_Owner](./get_owner/)() const | Koleksiyonun sahibi kontrolü alır. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Belirli bir kontrolü arar. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Belirli bir kontrolü arar. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon içinde yineleme yapmak için enumeratörü alır. |
| [idx_get](./idx_get/)(int) const override | Indeksle erişim sağlayıcı. |
| virtual [idx_get](./idx_get/)(System::String) const | İsme göre erişici. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Indeksle erişim sağlayıcı. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | İsme göre erişici. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Koleksiyonda kontrol arar. |
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
* Library [Aspose.Page for C++](../../../)

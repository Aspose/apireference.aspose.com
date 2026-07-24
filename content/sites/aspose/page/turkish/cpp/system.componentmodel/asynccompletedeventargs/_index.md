---
title: "System::ComponentModel::AsyncCompletedEventArgs sınıfı"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::AsyncCompletedEventArgs sınıfı. Bu sınıfın bir örneği AsyncCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Bu sınıfın bir örneği AsyncCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Yapıcı. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Yeni bir [System.ComponentModel.AsyncCompletedEventArgs](./) sınıfı örneği başlatır. |
| [get_Cancelled](./get_cancelled/)() const | Asenkron bir işlemin iptal edilip edilmediğini gösteren bir değer alır. Arka plan işlemi iptal edildiyse true; aksi takdirde false. Varsayılan değer false'tur. |
| [get_Error](./get_error/)() const | Asenkron bir işlem sırasında hangi hatanın oluştuğunu gösteren bir değer alır. |
| [get_UserState](./get_userstate/)() const | Asenkron görev için benzersiz tanımlayıcıyı alır. Asenkron görevi benzersiz şekilde tanımlayan bir nesne referansı; değer ayarlanmamışsa null. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null işaretçi) temsil eden statik üye. |
## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

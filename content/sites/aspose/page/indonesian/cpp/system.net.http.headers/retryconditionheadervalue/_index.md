---
title: "System::Net::Http::Headers::RetryConditionHeaderValue class"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue class. Mewakili nilai dari header ''Retry-After''. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


Mewakili nilai dari header 'Retry-After'. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | Informasi RTTI. |
| [get_Delta](./get_delta/)() | Mengembalikan nilai delta. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [RetryConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [RetryConditionHeaderValue](./). |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Membuat instance baru. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Membuat instance baru. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [RetryConditionHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)

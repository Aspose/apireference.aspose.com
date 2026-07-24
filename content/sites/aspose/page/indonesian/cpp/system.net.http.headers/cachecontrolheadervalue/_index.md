---
title: "System::Net::Http::Headers::CacheControlHeaderValue kelas"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue kelas. Mewakili nilai dari header ''Cache-Control''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Mewakili nilai dari header 'Cache-Control'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Extensions](./get_extensions/)() | Mengembalikan koleksi token ekstensi cache. |
| [get_MaxAge](./get_maxage/)() | Mendapatkan nilai usia maksimum dalam detik yang menentukan periode waktu di mana klien akan menerima respons. |
| [get_MaxStale](./get_maxstale/)() | Mendapatkan nilai yang menentukan apakah klien akan menerima respons yang kedaluwarsa. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Mendapatkan nilai dalam detik yang menentukan waktu di mana klien akan menerima respons yang kedaluwarsa. |
| [get_MinFresh](./get_minfresh/)() | Mendapatkan nilai yang menentukan masa hidup kesegaran. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Mendapatkan nilai yang menentukan apakah server memerlukan validasi ulang entri cache ketika menjadi usang. |
| [get_NoCache](./get_nocache/)() | Informasi RTTI. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Mendapatkan koleksi nama bidang dalam arahan 'no-cache' pada header 'Cache-Control'. |
| [get_NoStore](./get_nostore/)() | Mendapatkan nilai yang menentukan apakah cache tidak boleh menyimpan bagian apa pun dari permintaan atau respons HTTP. |
| [get_NoTransform](./get_notransform/)() | Mendapatkan nilai yang menentukan apakah cache atau proxy tidak boleh mengubah bagian apa pun dari badan entitas. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Mendapatkan nilai yang menentukan apakah klien harus hanya menggunakan entri yang di-cache. |
| [get_Private](./get_private/)() | Mendapatkan nilai yang menentukan apakah pesan respons HTTP atau bagiannya ditujukan untuk satu pengguna dan tidak boleh di-cache oleh cache bersama. |
| [get_PrivateHeaders](./get_privateheaders/)() | Mendapatkan koleksi nama bidang dalam arahan 'private' pada header 'Cache-Control'. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Mendapatkan nilai yang menentukan apakah server memerlukan validasi ulang entri cache ketika menjadi usang untuk cache agen pengguna bersama. |
| [get_Public](./get_public/)() | Mendapatkan nilai yang menentukan apakah respons HTTP dapat di-cache oleh cache mana pun. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Mendapatkan nilai usia maksimum bersama dalam detik yang menggantikan arahan 'max-age' dalam header 'Cache-Control' atau header 'Expires' untuk cache bersama. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Menetapkan nilai usia maksimum dalam detik yang menentukan periode waktu di mana klien akan menerima respons. |
| [set_MaxStale](./set_maxstale/)(bool) | Menetapkan nilai yang menentukan apakah klien akan menerima respons yang kedaluwarsa. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Menetapkan nilai dalam detik yang menentukan waktu selama klien akan menerima respons yang kedaluwarsa. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Menetapkan nilai yang menentukan masa hidup kesegaran. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Menetapkan nilai yang menentukan apakah server memerlukan validasi ulang entri cache ketika menjadi usang. |
| [set_NoCache](./set_nocache/)(bool) | Menetapkan nilai yang menentukan apakah klien akan menerima respons yang di-cache. |
| [set_NoStore](./set_nostore/)(bool) | Menetapkan nilai yang menentukan apakah cache tidak boleh menyimpan bagian apa pun dari permintaan atau respons HTTP. |
| [set_NoTransform](./set_notransform/)(bool) | Menetapkan nilai yang menentukan apakah cache atau proxy tidak boleh mengubah bagian apa pun dari badan entitas. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Menetapkan nilai yang menentukan apakah klien harus hanya menggunakan entri yang di-cache. |
| [set_Private](./set_private/)(bool) | Menetapkan nilai yang menentukan apakah pesan respons HTTP atau bagiannya ditujukan untuk satu pengguna dan tidak boleh di-cache oleh cache bersama. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Menetapkan nilai yang menentukan apakah server memerlukan validasi ulang entri cache ketika menjadi usang untuk cache agen pengguna bersama. |
| [set_Public](./set_public/)(bool) | Menetapkan nilai yang menentukan apakah respons HTTP dapat di-cache oleh cache mana pun. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Mengatur nilai usia maksimum bersama dalam detik yang menggantikan direktif 'max-age' pada header 'Cache-Control' atau header 'Expires' untuk cache bersama. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [CacheControlHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)

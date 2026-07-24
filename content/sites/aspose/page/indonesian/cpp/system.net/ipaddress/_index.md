---
title: "System::Net::IPAddress kelas"
linktitle: "IPAddress"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::IPAddress. Mewakili alamat IP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.net/ipaddress/
---
## IPAddress class


Mewakili alamat IP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class IPAddress : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() | Mengembalikan keluarga alamat. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Mengembalikan nilai yang menunjukkan apakah alamat tersebut adalah alamat IPv4 dan dipetakan ke alamat IPv6. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Mengembalikan nilai yang menunjukkan apakah alamat tersebut adalah alamat link-local IPv6. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Mengembalikan nilai yang menunjukkan apakah alamat tersebut adalah alamat multicast IPv6 global. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Mengembalikan nilai yang menunjukkan apakah alamat tersebut adalah alamat site-local IPv6. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Mengembalikan nilai yang menunjukkan apakah alamat tersebut adalah alamat Teredo IPv6. |
| [get_ScopeId](./get_scopeid/)() | Mendapatkan pengidentifikasi ruang lingkup dari alamat IPv6. |
| [GetAddressBytes](./getaddressbytes/)() | Mengembalikan array byte dari alamat IP. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [GetImpl](./getimpl/)() const | Mengembalikan pointer ke implementasi. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Mengonversi urutan byte host yang ditentukan ke urutan byte jaringan yang sesuai. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Mengonversi urutan byte host yang ditentukan ke urutan byte jaringan yang sesuai. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Mengonversi urutan byte host yang ditentukan ke urutan byte jaringan yang sesuai. |
| [IPAddress](./ipaddress/)(int64_t) | Membuat instance baru. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Membuat instance baru. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Membuat instance baru. |
| [IPAddress](./ipaddress/)() | Membuat instance baru. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Mengembalikan nilai yang menunjukkan apakah alamat yang ditentukan adalah alamat loopback. |
| [MapToIPv4](./maptoipv4/)() | Memetakan alamat ke alamat IPv4. |
| [MapToIPv6](./maptoipv6/)() | Memetakan alamat ke alamat IPv6. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Mengonversi urutan byte jaringan yang ditentukan ke urutan byte host yang sesuai. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Mengonversi urutan byte jaringan yang ditentukan ke urutan byte host yang sesuai. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Mengonversi urutan byte jaringan yang ditentukan ke urutan byte host yang sesuai. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [IPAddress](./). |
| [set_ScopeId](./set_scopeid/)(int64_t) | Mengatur pengidentifikasi ruang lingkup dari alamat IPv6. |
| [SetImpl](./setimpl/)(ImplPtr) | Menetapkan pointer ke implementasi. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Berusaha mengonversi string yang diberikan menjadi sebuah instance dari kelas [IPAddress](./). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Any](./any/) | Informasi RTTI. |
| static [Broadcast](./broadcast/) | Alamat broadcast IPv4. |
| static [IPv6Any](./ipv6any/) | Alamat IPv6 yang menunjukkan apakah server harus mendengarkan semua antarmuka jaringan. |
| static [IPv6Loopback](./ipv6loopback/) | Alamat loopback IPv6. |
| static [IPv6None](./ipv6none/) | Alamat IPv6 yang menunjukkan apakah server tidak boleh mendengarkan antarmuka jaringan mana pun. |
| static [Loopback](./loopback/) | Alamat loopback IPv4. |
| static [None](./none/) | Alamat IPv4 yang menunjukkan apakah server tidak boleh mendengarkan antarmuka jaringan mana pun. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ImplPtr](./implptr/) | Pointer ke tipe implementasi. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

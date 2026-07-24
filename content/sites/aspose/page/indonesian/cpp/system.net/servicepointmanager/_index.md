---
title: "Kelas System::Net::ServicePointManager"
linktitle: "ServicePointManager"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::ServicePointManager. Mengelola tahap siklus hidup (pembuatan, pemeliharaan, dan penghapusan) dari instance kelas ServicePoint. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 3200
url: /id/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Mengelola tahap siklus hidup (pembuatan, pemeliharaan, dan penghapusan) dari instance kelas [ServicePoint](../servicepoint/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class ServicePointManager : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Mendapatkan kebijakan sertifikat. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Mendapatkan nilai yang menunjukkan apakah sertifikat harus diperiksa terhadap daftar pencabutan otoritas sertifikat. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Mendapatkan jumlah maksimum koneksi bersamaan yang diizinkan oleh instance kelas ServicePoint. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Mendapatkan batas waktu dalam milidetik selama resolusi DNS dianggap valid. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Mendapatkan nilai yang menunjukkan apakah resolusi DNS berputar di antara alamat IP yang berlaku. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Mengembalikan kebijakan enkripsi yang digunakan oleh instance saat ini. |
| static [get_Expect100Continue](./get_expect100continue/)() | Mendapatkan nilai yang menunjukkan apakah instance kelas ServicePoint menggunakan perilaku 100-Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Mendapatkan waktu menganggur maksimum dari instance kelas ServicePoint. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Mendapatkan jumlah maksimum instance kelas ServicePoint yang dapat dikelola oleh instance saat ini. |
| static [get_ReusePort](./get_reuseport/)() | Mendapatkan nilai yang menunjukkan apakah soket koneksi keluaran menggunakan opsi 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Mendapatkan tipe protokol keamanan yang digunakan oleh instance kelas ServicePoint yang dikelola oleh instance saat ini. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Mendapatkan callback yang digunakan untuk memvalidasi sertifikat server. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Mendapatkan nilai yang menunjukkan apakah instance kelas ServicePoint menggunakan algoritma Nagle. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Mengatur kebijakan sertifikat. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Mengatur nilai yang menunjukkan apakah sertifikat harus diperiksa terhadap daftar pencabutan otoritas sertifikat. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Mengatur jumlah maksimum koneksi bersamaan yang diizinkan oleh instance kelas ServicePoint. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Mengatur batas waktu dalam milidetik selama resolusi DNS dianggap valid. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Mengatur nilai yang menunjukkan apakah resolusi DNS berputar di antara alamat IP yang berlaku. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Mengatur nilai yang menunjukkan apakah instance ServicePoint-class menggunakan perilaku 100-Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Mengatur waktu idle maksimum dari instance ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Mengatur jumlah maksimum instance ServicePoint-class yang dapat dikelola oleh instance saat ini. |
| static [set_ReusePort](./set_reuseport/)(bool) | Mengatur nilai yang menunjukkan apakah soket koneksi output menggunakan opsi 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Mengatur tipe protokol keamanan yang digunakan oleh instance ServicePoint-class yang dikelola oleh instance saat ini. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Mengatur callback yang digunakan untuk memvalidasi sertifikat server. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Mengatur nilai yang menunjukkan apakah instance ServicePoint-class menggunakan algoritma Nagle. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Mengatur nilai yang menunjukkan apakah opsi 'Keep-Alive' diaktifkan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | Informasi RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Jumlah default koneksi persisten. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

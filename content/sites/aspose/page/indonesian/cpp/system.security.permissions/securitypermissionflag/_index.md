---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Permissions::SecurityPermissionFlag enum. Bendera izin keamanan di C++."
type: docs
weight: 300
url: /id/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Bendera izin keamanan.

```cpp
enum class SecurityPermissionFlag
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| NoFlags | 0 | Tidak ada akses. |
| Assertion | 1 | Pastikan bahwa izin diberikan. |
| UnmanagedCode | 2 | Panggil kode tidak terkelola. |
| SkipVerification | 4 | Lewati verifikasi kode. |
| Execution | 8 | Jalankan kode. |
| ControlThread | 16 | Lakukan operasi pada thread. |
| ControlEvidence | 32 | Kontrol atau ubah bukti CLR. |
| ControlPolicy | 64 | Lihat dan ubah kebijakan. |
| SerializationFormatter | 128 | Serialisasi. |
| ControlDomainPolicy | 256 | Atur kebijakan domain. |
| ControlPrincipal | 512 | Kontrol objek principal. |
| ControlAppDomain | 1024 | Kontrol domain aplikasi. |
| RemotingConfiguration | 2048 | Konfigurasikan remoting. |
| Infrastruktur | 4096 | Sambungkan ke infrastruktur CLR. |
| BindingRedirects | 8192 | Lakukan pengalihan binding secara eksplisit. |
| AllFlags | 16383 | Tidak terbatas. |

## Lihat Juga

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)

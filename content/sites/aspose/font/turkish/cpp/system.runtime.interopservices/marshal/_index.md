---
title: "System::Runtime::InteropServices::Marshal sınıfı"
linktitle: "Marshal"
second_title: "Aspose.Font için C++"
description: "System::Runtime::InteropServices::Marshal sınıfı. Serileştirme uygulaması sağlar. Yalnızca çevrilen kodla uyumluluk amacıyla, C++ tarafında yönetilen kod desteklenmediği için. Bu, örnek hizmetleri olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 100
url: /tr/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Marshalling uygulamasını sağlar. Yalnızca çevrilen kodla uyumluluk için, çünkü C++ tarafında yönetilen kod desteklenmez. Bu, örnek hizmetleri olmayan statik bir türdür. Onun hiçbir şekilde örneklerini oluşturmayınız.

```cpp
class Marshal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Yönetilmeyen belleği ayırır. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Yönetilmeyen belleği ayırır. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) semantiğini uygular. |
| static [Copy](./copy/)(const void *, container\&&, int, int) | public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) semantiğini uygular. |
| static [Copy](./copy/)(const container\&, int, void *, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) uygular. |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | public static void Copy(char[] source, int startIndex, IntPtr destination, int length) uygular. |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Yönetilmeyen belleği serbest bırakır. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | İstisna'dan HResult alır. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Yönetilmeyen sıfır sonlandırmalı UTF8 dizesinden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Yönetilmeyen UTF8 dizesinden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Yönetilmeyen sıfır sonlandırmalı dizeden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Yönetilmeyen dizeden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Yönetilmeyen sıfır sonlandırmalı unicode dizeden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Yönetilmeyen unicode dizeden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Yönetilmeyen sıfır sonlandırmalı UTF8 dizesinden yönetilen bir [String](../../system/string/) oluşturur. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Yönetilmeyen UTF8 dizesinden yönetilen bir [String](../../system/string/) oluşturur. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Bellekten bayt okur. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Bellekten short okur. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Bellekten int okur. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Belirtilen güvenli dize içeriğini yönetilmeyen belleğe kopyalar, ANSI formatına dönüştürerek. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Belirtilen güvenli dize içeriğini yönetilmeyen belleğe kopyalar. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Belirtilen bir dize içeriğini yönetilmeyen belleğe kopyalar. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Belirtilen bir dize içeriğini yönetilmeyen belleğe kopyalar, gerekirse ANSI formatına dönüştürür. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Belirtilen bir dize içeriğini yönetilmeyen belleğe kopyalar. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Belleğe bayt yazar. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Belleğe bayt yazar. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Belleğe short yazar. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | int'i belleğe yazar. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | long'u belleğe yazar. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | SecureStringToGlobalAllocAnsi yöntemi kullanılarak ayrılan yönetilmeyen dize işaretçisini serbest bırakır. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | SecureStringToGlobalAllocUnicode yöntemi kullanılarak ayrılan yönetilmeyen dize işaretçisini serbest bırakır. |
## Ayrıca Bakınız

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)

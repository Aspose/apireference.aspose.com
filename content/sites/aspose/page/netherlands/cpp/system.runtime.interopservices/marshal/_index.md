---
title: "System::Runtime::InteropServices::Marshal klasse"
linktitle: "Marshal"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::InteropServices::Marshal klasse. Biedt een marshalling-implementatie. Alleen voor compatibiliteit met vertaalde code, aangezien er geen beheerde code wordt ondersteund aan de C++-kant. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken in C++."
type: docs
weight: 100
url: /nl/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Biedt een marshalling-implementatie. Alleen voor compatibiliteit met vertaalde code, aangezien er geen beheerde code wordt ondersteund aan de C++-kant. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class Marshal
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Reserveert niet‑beheerd geheugen. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Reserveert niet‑beheerd geheugen. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Implementeert public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) semantics. |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Implementeert public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) semantics. |
| static [Copy](./copy/)(const container\&, int, void *, int) | Implementeert public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Implementeert public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Vrijgeeft niet‑beheerd geheugen. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Haalt HResult op van uitzondering. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet‑beheerde nul‑geëindigde UTF8‑string. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet‑beheerde UTF8‑string. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet-beheerde nul-terminerende string. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet-beheerde string. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet-beheerde nul-terminerende Unicode-string. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet-beheerde Unicode-string. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet‑beheerde nul‑geëindigde UTF8‑string. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Maakt een beheerde [String](../../system/string/) aan vanuit een niet‑beheerde UTF8‑string. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Leest een byte uit het geheugen. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Leest een short uit het geheugen. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Leest een int uit het geheugen. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Kopieert de inhoud van de opgegeven secure string naar niet-beheerd geheugen, waarbij geconverteerd wordt naar ANSI-indeling. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Kopieert de inhoud van de opgegeven secure string naar niet-beheerd geheugen. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Kopieert de inhoud van een opgegeven string naar niet-beheerd geheugen. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Kopieert de inhoud van een opgegeven string naar niet-beheerd geheugen, waarbij geconverteerd wordt naar ANSI-indeling indien nodig. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Kopieert de inhoud van een opgegeven string naar niet-beheerd geheugen. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Schrijft een byte naar het geheugen. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Schrijft een byte naar het geheugen. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Schrijft een short naar het geheugen. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Schrijft een int naar het geheugen. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Schrijft een long naar het geheugen. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Vrijgeeft de niet-beheerde stringpointer die is toegewezen met de SecureStringToGlobalAllocAnsi method. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Vrijgeeft de niet-beheerde stringpointer die is toegewezen met de SecureStringToGlobalAllocUnicode method. |
## Zie ook

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)

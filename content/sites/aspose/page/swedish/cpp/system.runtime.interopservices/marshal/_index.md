---
title: "Klassen System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Page för C++"
description: "Klassen System::Runtime::InteropServices::Marshal. Tillhandahåller marshalleringsimplementation. Endast för kompatibilitet med översatt kod, eftersom ingen hanterad kod stöds på C++-sidan. Detta är en statisk typ utan instansmetoder. Du bör aldrig skapa instanser av den på något sätt i C++."
type: docs
weight: 100
url: /sv/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Tillhandahåller marshaling-implementation. Endast för kompatibilitet med översatt kod, eftersom ingen hanterad kod stöds på C++-sidan. Detta är en statisk typ utan instans-tjänster. Du bör aldrig skapa instanser av den på något sätt.

```cpp
class Marshal
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Allokerar ohanterat minne. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Allokerar ohanterat minne. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Implementerar den offentliga statiska void Copy(IntPtr source, byte[] destination, int startIndex, int length)-semantiken. |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Implementerar den offentliga statiska void Copy(IntPtr source, byte[] destination, int startIndex, int length)-semantiken. |
| static [Copy](./copy/)(const container\&, int, void *, int) | Implementerar den offentliga statiska void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Implementerar den offentliga statiska void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Frigör ohanterat minne. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Hämtar HResult från undantag. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Skapar en hanterad [String](../../system/string/) från en ohanterad nollterminerad UTF8-sträng. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Skapar en hanterad [String](../../system/string/) från en ohanterad UTF8-sträng. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Skapar en hanterad [String](../../system/string/) från en ohanterad nollterminerad sträng. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Skapar en hanterad [String](../../system/string/) från en ohanterad sträng. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Skapar en hanterad [String](../../system/string/) från en ohanterad nollterminerad unicode-sträng. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Skapar en hanterad [String](../../system/string/) från en ohanterad unicode-sträng. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Skapar en hanterad [String](../../system/string/) från en ohanterad nollterminerad UTF8-sträng. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Skapar en hanterad [String](../../system/string/) från en ohanterad UTF8-sträng. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Läser en byte från minnet. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Läser ett short från minnet. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Läser ett int från minnet. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Kopierar innehållet i den angivna säkra strängen till ohanterat minne och konverterar till ANSI-format. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Kopierar innehållet i den angivna säkra strängen till ohanterat minne. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Kopierar innehållet i en angiven sträng till ohanterat minne. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Kopierar innehållet i en angiven sträng till ohanterat minne och konverterar till ANSI-format om det krävs. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Kopierar innehållet i en angiven sträng till ohanterat minne. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Skriver en byte till minnet. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Skriver en byte till minnet. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Skriver ett short till minnet. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Skriver ett int till minnet. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Skriver ett long till minnet. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Frigör ohanterad strängpekare som allokerades med metoden SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Frigör ohanterad strängpekare som allokerades med metoden SecureStringToGlobalAllocUnicode. |
## Se även

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Page for C++](../../)

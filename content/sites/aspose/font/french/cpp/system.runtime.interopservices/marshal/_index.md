---
title: "Classe System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Font pour C++"
description: "Classe System::Runtime::InteropServices::Marshal. Fournit une implémentation du marshaling uniquement pour la compatibilité avec le code traduit, car aucun code géré n'est pris en charge du côté C++. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui‑ci, quel que soit le moyen, en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Fournit une implémentation du marshaling. Pour la compatibilité avec le code traduit uniquement, car aucun code géré n'est pris en charge du côté C++. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quel que soit le moyen.

```cpp
class Marshal
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Alloue de la mémoire non gérée. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Alloue de la mémoire non gérée. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Implémente la sémantique public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Implémente la sémantique public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | Implémente public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Implémente public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Libère la mémoire non gérée. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Obtient le HResult de l'exception. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Crée un [String](../../system/string/) géré à partir d'une chaîne UTF8 non gérée terminée par zéro. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Crée un [String](../../system/string/) géré à partir d'une chaîne UTF8 non gérée. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Crée un [String](../../system/string/) géré à partir d'une chaîne non gérée terminée par zéro. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Crée un [String](../../system/string/) géré à partir d'une chaîne non gérée. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Crée un [String](../../system/string/) géré à partir d'une chaîne Unicode non gérée terminée par zéro. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Crée un [String](../../system/string/) géré à partir d'une chaîne Unicode non gérée. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Crée un [String](../../system/string/) géré à partir d'une chaîne UTF8 non gérée terminée par zéro. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Crée un [String](../../system/string/) géré à partir d'une chaîne UTF8 non gérée. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Lit un octet depuis la mémoire. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Lit un short depuis la mémoire. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Lit un int depuis la mémoire. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Copie le contenu de la chaîne sécurisée spécifiée dans la mémoire non gérée, en le convertissant au format ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Copie le contenu de la chaîne sécurisée spécifiée dans la mémoire non gérée. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Copie le contenu d'une chaîne spécifiée dans la mémoire non gérée. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Copie le contenu d'une chaîne spécifiée dans la mémoire non gérée, en le convertissant au format ANSI si nécessaire. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Copie le contenu d'une chaîne spécifiée dans la mémoire non gérée. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Écrit un octet en mémoire. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Écrit un octet en mémoire. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Écrit un short en mémoire. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Écrit un int en mémoire. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Écrit un long en mémoire. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Libère le pointeur de chaîne non géré qui a été alloué en utilisant la méthode SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Libère le pointeur de chaîne non géré qui a été alloué en utilisant la méthode SecureStringToGlobalAllocUnicode. |
## Voir aussi

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)

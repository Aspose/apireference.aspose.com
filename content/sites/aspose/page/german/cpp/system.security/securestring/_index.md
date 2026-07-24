---
title: "System::Security::SecureString Klasse"
linktitle: "SecureString"
second_title: "Aspose.Page für C++"
description: "System::Security::SecureString Klasse. Sicherer String, stellt Text dar, der vertraulich zu behandeln ist. Diese Klasse VERSCHLÜSSELT die internen Daten NICHT. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 100
url: /de/cpp/system.security/securestring/
---
## SecureString class


Secure string, stellt Text dar, der vertraulich zu behandeln ist. Diese Klasse VERSCHLÜSSELN die internen Daten NICHT. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class SecureString : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Fügt ein Zeichen am Ende der Zeichenkette hinzu. |
| [Clear](./clear/)() | Löscht alle Zeichen aus dem aktuellen SecureString. |
| [Copy](./copy/)() const | Erstellt ein Duplikat dieses SecureString. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei. |
| [get_Length](./get_length/)() const | Ermittelt die Anzahl der Zeichen in dieser sicheren Zeichenfolge. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Fügt ein Zeichen an dem angegebenen Index ein. |
| [IsReadOnly](./isreadonly/)() const | Ermittelt das Flag, das angibt, ob dieses Objekt als schreibgeschützt markiert ist. |
| [MakeReadOnly](./makereadonly/)() | Macht diese sichere Zeichenfolge schreibgeschützt. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Entfernt das Zeichen an der angegebenen Position. |
| [SecureString](./securestring/)() | RTTI-Informationen. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Konstruktor. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Ersetzt das vorhandene Zeichen an der angegebenen Position. |
| [ToUnsecureString](./tounsecurestring/)() const | Kopiert den Inhalt dieser sicheren Zeichenfolge in ein unsicheres [String](../../system/string/)‑Objekt. Mit Vorsicht verwenden. |
| [~SecureString](./~securestring/)() | Destruktor. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)

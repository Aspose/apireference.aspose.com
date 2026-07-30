---
title: "System::Security::Cryptography::SymmetricAlgorithm Klasse"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::SymmetricAlgorithm Klasse. Symmetrischer Algorithmus, der denselben Schlüssel für Verschlüsselung und Entschlüsselung verwendet, Basisklasse. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 4900
url: /de/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Symmetrischer Algorithmus, der denselben Schlüssel für Verschlüsselung und Entschlüsselung verwendet, Basisklasse. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)(const String\&) | Erstellt eine Instanz des Algorithmus. |
| virtual [CreateDecryptor](./createdecryptor/)() | Erstellt einen Decryptor mit Parametern, die dem Algorithmusobjekt zugeordnet sind. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Erstellt einen Decryptor mit expliziten Parametern. |
| virtual [CreateEncryptor](./createencryptor/)() | Erstellt einen Encryptor mit Parametern, die dem Algorithmusobjekt zugeordnet sind. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Erstellt einen Verschlüsseler mit expliziten Parametern. |
| virtual [GenerateIV](./generateiv/)() | Erzeugt einen zufälligen Initialwert für den Algorithmus. Überschreibt den vorhandenen (falls vorhanden). |
| virtual [GenerateKey](./generatekey/)() | Erzeugt einen zufälligen Schlüssel für den Algorithmus. Überschreibt den vorhandenen (falls vorhanden). |
| virtual [get_BlockSize](./get_blocksize/)() | Liefert die Blockgröße der kryptografischen Operation. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Liefert die Rückmeldungsgröße der kryptografischen Operation. |
| virtual [get_IV](./get_iv/)() | Liefert den Initialwert der kryptografischen Operation. Erstellt einen neuen, falls noch keiner erstellt wurde. |
| virtual [get_Key](./get_key/)() | Liefert den Schlüssel der kryptografischen Operation. Erstellt einen neuen, falls noch keiner erstellt wurde. |
| virtual [get_KeySize](./get_keysize/)() | Liefert die Schlüssellänge der kryptografischen Operation. |
| virtual [get_Mode](./get_mode/)() | Liefert den Modus der kryptografischen Operation. |
| virtual [get_Padding](./get_padding/)() | Liefert das Padding der kryptografischen Operation. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Setzt die Blockgröße der kryptografischen Operation. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Setzt die Rückmeldungsgröße der kryptografischen Operation. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Setzt den Initialwert der kryptografischen Operation. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Setzt den Schlüssel der kryptografischen Operation. |
| virtual [set_KeySize](./set_keysize/)(int) | Setzt die Schlüssellänge der kryptografischen Operation. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Setzt den Modus der kryptografischen Operation. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Setzt das Padding der kryptografischen Operation. |
| [ValidKeySize](./validkeysize/)(int) | Überprüft, ob die Schlüssellänge gültig ist. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Globalization::CultureInfo class"
linktitle: "CultureInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::CultureInfo Klasse. Sammlung von kulturspezifischen Werten und Algorithmen. Setter-Operationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Sammlung von kulturspezifischen Werten und Algorithmen. Setter-Operationen sind nur bei nicht schreibgeschützten Objekten aktiviert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Aktualisiert zwischengespeicherte Kulturinformationen. |
| [Clone](./clone/)() override | Klonen von Kulturinformationen. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Erstellt eine Kultur anhand des Namens. |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI-Informationen. |
| [CultureInfo](./cultureinfo/)(int, bool) | Konstruktor. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Konstruktor. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Konstruktor. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Wirft stets ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht Objekte. |
| virtual [get_Calendar](./get_calendar/)() const | Gibt den von der Kultur verwendeten Kalender zurück. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Gibt den Zeichenfolgenvergleich zurück, der den Kulturregeln entspricht. |
| [get_CultureTypes](./get_culturetypes/)() const | Gibt die bitweise Verknüpfung der Kulturtypen zurück, die die aktuelle Kultur beschreiben. |
| static [get_CurrentCulture](./get_currentculture/)() | Gibt die für den aktuellen Thread festgelegte Kultur zurück. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Gibt die UI‑Kultur des aktuellen Threads zurück. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Gibt Datumsformatinformationen zurück. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Gibt die Standardkultur im aktuellen Anwendungsdomäne zurück. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Gibt die Standard‑UI‑Kultur im aktuellen Anwendungsdomäne zurück. |
| virtual [get_DisplayName](./get_displayname/)() const | Gibt den Anzeigenamen der Kultur zurück. |
| virtual [get_EnglishName](./get_englishname/)() const | Gibt den englischen Namen der Kultur zurück. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Gibt den RFC‑4646‑Namen für eine Sprache zurück. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Gibt die mit dem Betriebssystem installierte Kultur zurück. |
| static [get_InvariantCulture](./get_invariantculture/)() | Gibt die Invariante Kultur zurück. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Prüft, ob die Kultur neutral ist. |
| [get_IsReadOnly](./get_isreadonly/)() const | Prüft, ob das Kulturobjekt schreibgeschützt ist. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Gibt die aktive Eingabe‑Locale‑Kennung zurück. |
| virtual [get_LCID](./get_lcid/)() const | Gibt die Kulturkennung zurück. |
| virtual [get_Name](./get_name/)() const | Gibt den Kulturnamen zurück. |
| virtual [get_NativeName](./get_nativename/)() const | Liefert den nativen Namen der Kultur. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Liefert Informationen zum Zahlenformat. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Liste der Kalender, die mit der Kultur verwendet werden können. |
| virtual [get_Parent](./get_parent/)() const | Liefert die übergeordnete Kultur. |
| virtual [get_TextInfo](./get_textinfo/)() const | Liefert die von der Kultur verwendeten Textparameter. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Liefert den dreibuchstabigen ISO‑639‑2‑Sprachcode. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Liefert den dreibuchstabigen Sprachcode, wie in der [Windows](../../system.windows/)‑API definiert. |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Liefert den zweibuchstabigen ISO‑Sprachnamen, der mit der Kultur verknüpft ist. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Liefert ein Flag, das angibt, ob die [CultureInfo](./) benutzerdefinierte Kultureinstellungen verwendet. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Liefert eine alternative Kultur, die für Konsolenanwendungen geeignet ist. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Liefert die Kultur anhand ihres Namens. Entspricht CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Liefert die Kultur anhand ihres Namens. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Liefert die Kultur anhand ihrer ID. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Veraltet. Liefert ein schreibgeschütztes [CultureInfo](./)-Objekt anhand des angegebenen RFC‑4646‑Sprach-Tags. |
| static [GetCultures](./getcultures/)(CultureTypes) | Liefert Kulturen, die in die angegebenen Typen fallen. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Liefert ein Formatobjekt für einen bestimmten Typ. |
| [GetHashCode](./gethashcode/)() const override | Gibt den Hashcode des Objekts zurück. |
| [IsInherited](./isinherited/)() const | Liefert das Vererbungs‑Flag. NUR FÜR INTERNEN GEBRAUCH. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Vergleicht Kulturparameter. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Ermittelt eine schreibgeschützte Version der Kultur. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Setzt die Kultur für den aktuellen Thread. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Setzt die UI‑Kultur des aktuellen Threads. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Setzt die Datumsformatinformationen. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Setzt die Standardkultur in der aktuellen Anwendungsdomäne. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Setzt die Standard‑UI‑Kultur in der aktuellen Anwendungsdomäne. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Liefert Informationen zum Zahlenformat. |
| [ToString](./tostring/)() const override | Konvertiert die Kultur in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)

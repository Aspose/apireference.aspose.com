---
title: "System::Globalization::CultureInfo class"
linktitle: "CultureInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Globalization::CultureInfo. Collection de valeurs et d'algorithmes spécifiques à la culture. Les opérations de définition ne sont activées que sur des objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Collection de valeurs et d'algorithmes spécifiques à la culture. Les opérations de définition ne sont activées que sur des objets non en lecture seule. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Actualise les informations de culture en cache. |
| [Clone](./clone/)() override | Clone les informations de culture. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Crée une culture à partir du nom. |
| explicit [CultureInfo](./cultureinfo/)(int) | Informations RTTI. |
| [CultureInfo](./cultureinfo/)(int, bool) | Constructeur. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Constructeur. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Constructeur. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Lance toujours ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Compare les objets. |
| virtual [get_Calendar](./get_calendar/)() const | Obtient le calendrier utilisé par la culture. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Obtient le comparateur de chaînes qui respecte les règles de la culture. |
| [get_CultureTypes](./get_culturetypes/)() const | Obtient la combinaison binaire des types de culture qui décrivent la culture actuelle. |
| static [get_CurrentCulture](./get_currentculture/)() | Obtient la culture définie pour le thread actuel. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Obtient la culture UI du thread actuel. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Obtient les informations de format de date. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Obtient la culture par défaut dans le domaine d'application actuel. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Obtient la culture UI par défaut dans le domaine d'application actuel. |
| virtual [get_DisplayName](./get_displayname/)() const | Obtient le nom affiché de la culture. |
| virtual [get_EnglishName](./get_englishname/)() const | Obtient le nom anglais de la culture. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Obtient le nom RFC 4646 d'une langue. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Obtient la culture installée avec le système d'exploitation. |
| static [get_InvariantCulture](./get_invariantculture/)() | Obtient la culture invariante. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Vérifie si la culture est neutre. |
| [get_IsReadOnly](./get_isreadonly/)() const | Vérifie si l'objet culture est en lecture seule. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Obtient l'identifiant de locale d'entrée actif. |
| virtual [get_LCID](./get_lcid/)() const | Obtient l'identifiant de la culture. |
| virtual [get_Name](./get_name/)() const | Obtient le nom de la culture. |
| virtual [get_NativeName](./get_nativename/)() const | Obtient le nom natif de la culture. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Obtient les informations de format numérique. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Liste des calendriers pouvant être utilisés avec la culture. |
| virtual [get_Parent](./get_parent/)() const | Obtient la culture parente. |
| virtual [get_TextInfo](./get_textinfo/)() const | Obtient les paramètres texte utilisés par la culture. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Obtient le code langue ISO 639-2 à trois lettres. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Obtient le code à trois lettres de la langue tel que défini dans l'API [Windows](../../system.windows/). |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Obtient le nom de langue ISO à deux lettres associé à la culture. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Obtient un indicateur indiquant si le [CultureInfo](./) utilise les paramètres de culture sélectionnés par l'utilisateur. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Obtient une culture alternative adaptée aux applications console. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Obtient la culture par son nom. Identique à CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Obtient la culture par son nom. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Obtient la culture par identifiant. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Obsolète. Obtient un objet [CultureInfo](./) en lecture seule à partir du tag de langue RFC 4646 spécifié. |
| static [GetCultures](./getcultures/)(CultureTypes) | Obtient les cultures qui correspondent aux types spécifiés. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Obtient l'objet de format pour le type spécifique. |
| [GetHashCode](./gethashcode/)() const override | Renvoie le code de hachage de l'objet. |
| [IsInherited](./isinherited/)() const | Obtient le drapeau is-inherited. POUR USAGE INTERNE. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Compare les paramètres de la culture. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Obtient une version en lecture seule de la culture. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Définit la culture pour le thread actuel. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Définit la culture UI du thread actuel. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Définit les informations de format de date. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Définit la culture par défaut dans le domaine d'application actuel. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Définit la culture UI par défaut dans le domaine d'application actuel. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Obtient les informations de format numérique. |
| [ToString](./tostring/)() const override | Convertit la culture en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)

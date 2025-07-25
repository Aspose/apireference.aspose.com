---
title: FormatConditionType énumération
second_title: Aspose.Cells for Python via .NET API Références
description:
type: docs
weight: 2110
url: /fr/aspose.cells/formatconditiontype/
is_root: false
---
##  FormatConditionType énumération
Type de règle de format conditionnel.



Le type FormatConditionType expose les membres suivants :

###  Des champs
| Champ| Description|
| :- | :- |
| CELL_VALUE | Cette règle de mise en forme conditionnelle compare une valeur de cellule<br/> à un résultat calculé par formule, à l'aide d'un opérateur.|
| EXPRESSION | Cette règle de mise en forme conditionnelle contient une formule pour<br/>évaluer. Lorsque le résultat de la formule est vrai, la cellule est<br/> mis en évidence.|
| TOP10 | Cette règle de mise en forme conditionnelle met en évidence les cellules dont<br/>les valeurs se situent dans la tranche supérieure N ou inférieure N, comme<br/> spécifié.|
| UNIQUE_VALUES | Cette règle de mise en forme conditionnelle met en évidence les éléments uniques<br/> valeurs dans la plage.|
| DUPLICATE_VALUES | Cette règle de mise en forme conditionnelle met en évidence les doublons<br/> valeurs.|
| CONTAINS_TEXT | Cette règle de mise en forme conditionnelle met en évidence les cellules<br/>contenant le texte donné. Équivalent à l'utilisation de SEARCH()<br/>fonction de feuille pour déterminer si la cellule contient<br/> le texte.|
| NOT_CONTAINS_TEXT | Cette règle de mise en forme conditionnelle met en évidence les cellules qui<br/>Ne contient pas le texte donné. Équivalent à SEARCH()<br/>fonction de feuille pour déterminer si la cellule contient<br/> le texte ou pas.|
| BEGINS_WITH | Cette règle de mise en forme conditionnelle met en évidence les cellules dans le<br/>plage commençant par le texte donné. Équivalent à<br/> en utilisant la fonction de feuille LEFT() et en comparant les valeurs.|
| ENDS_WITH | Cette règle de mise en forme conditionnelle met en évidence les cellules se terminant par<br/>avec le texte donné. Équivalent à l'utilisation de la feuille RIGHT()<br/> fonction et comparaison de valeurs.|
| CONTAINS_BLANKS | Cette règle de mise en forme conditionnelle met en évidence les cellules qui<br/>sont complètement vides. Équivalent à l'utilisation de LEN(TRIM()).<br/>Cela signifie que si la cellule ne contient que des caractères<br/>que TRIM() supprimerait, alors il est considéré comme vide.<br/> Une cellule vide est également considérée comme vide.|
| NOT_CONTAINS_BLANKS | Cette règle de mise en forme conditionnelle met en évidence les cellules qui<br/>ne sont pas vides. Équivalent à l'utilisation de LEN(TRIM()). Ceci<br/>signifie que si la cellule contient uniquement des caractères qui<br/>TRIM() serait supprimé, alors il est considéré comme vide. Un<br/> une cellule vide est également considérée comme vide.|
| CONTAINS_ERRORS | Cette règle de mise en forme conditionnelle met en évidence les cellules avec<br/>Erreurs de formule. Équivalent à l'utilisation de la feuille ISERROR()<br/> fonction permettant de déterminer s'il y a une erreur de formule.|
| NOT_CONTAINS_ERRORS | Cette règle de mise en forme conditionnelle met en évidence les cellules<br/>sans erreur de formule. Équivalent à ISERROR()<br/> fonction de feuille pour déterminer s'il y a une erreur de formule.|
| TIME_PERIOD | Cette règle de mise en forme conditionnelle met en évidence les cellules<br/>contenant des dates dans la période spécifiée.<br/>la valeur sous-jacente de la cellule est évaluée, donc la<br/>la cellule n'a pas besoin d'être formatée comme une date pour être<br/>évalué. Par exemple, avec une cellule contenant le<br/>valeur 38913 le format conditionnel doit être appliqué si<br/> la règle exige une valeur de 14/07/2006.|
| ABOVE_AVERAGE | Cette règle de mise en forme conditionnelle met en évidence les cellules qui<br/>sont au-dessus ou en dessous de la moyenne pour toutes les valeurs de la<br/> gamme.|
| COLOR_SCALE | Cette règle de mise en forme conditionnelle crée une gradation<br/> échelle de couleurs sur les cellules.|
| DATA_BAR | Cette règle de mise en forme conditionnelle affiche une échelle graduée<br/> barre de données dans la plage de cellules.|
| ICON_SET |Cette règle de mise en forme conditionnelle applique des icônes aux cellules<br/> selon leurs valeurs.|



###  Voir également
* module [`aspose.cells`](..)

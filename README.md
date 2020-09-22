# Entrevoisins

## Compilation du projet

Pour compiler le projet éxécuter la commande suivante : 

```bash
./gradlew assembleDebug install
```
## Exécuter le projet

```bash
adb shell am start -n com.openclassroom.entrvoisins/com.openclassroom.entrvoisins.ui.neighbour.list.ListNeighbourActivity
```

## Exécuter les tests unitaires

```bash
./gradlew testDebugUnitTest
```

Vous pouvez retrouver le resultat dans `app/build/report`
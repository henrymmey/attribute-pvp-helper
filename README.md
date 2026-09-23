# Attribute PVP Helper (Reforged)

A client-side PvP helper for Minecraft 26.2 (Fabric). This is my own continuation of the original [Attribute PVP Helper](https://modrinth.com/project/D7LBHzLK) by ViratS-best, updated to Minecraft 26.2, Java 25 and renamed to `attribute-pvp-helper-reforged`.

All features run locally on your client. The mod only registers a few no-op lifecycle hooks on the server side; it adds no new blocks, items or commands.

## Features

- **Damage dealt tracker** – shows how much damage you dealt to a target in the action bar (red/yellow), tracks entities up to 30 blocks away, display lasts 3 seconds.
- **Damage taken indicator** – shows how much damage you just took.
- **Spear lunge helper** – tells you when a spear lunge is possible: charge meter (`Charge spear...`), missing momentum (`Move forward to lunge!`) or green `READY TO LUNGE` once all conditions are met.
- **Attribute swap detection** – prints a confirmation when you swap weapons in your hotbar, e.g. `Swapped: Iron Sword → Diamond Sword`.
- **Mace range helper** – while holding a mace, shows the distance to the nearest entity, e.g. `Mace Range: 4.2 blocks` (range: 10 blocks).

## Requirements

- Minecraft **26.2**
- Fabric Loader **0.19.5 or higher**
- Fabric API **0.161.0 or higher**
- Java **25**

## Installation

1. Copy `attribute-pvp-helper-reforged-1.0.0.jar` into your `mods/` folder.
2. Launch Minecraft with the Fabric profile.
3. That's it – the helper runs entirely on your client, no server mod required.

## Building from source

I use the Gradle wrapper, no global Gradle needed:

```sh
./gradlew build
```

The finished jar ends up in `build/libs/attribute-pvp-helper-reforged-1.0.0.jar`.

To launch a dev client (for testing in singleplayer):

```sh
./gradlew runClient
```

## How it works (briefly)

- `CombatAssistant` – the main tick handler (weapon swaps, mace range, damage taken).
- `SpearHelper` – spear lunge condition checks.
- `DamageDealtTracker` – tracks health changes of nearby entities to measure damage dealt.
- `DamageIndicator` – buffers the last damage value for the action bar.
- `Mixin` classes – only lifecycle hooks, no gameplay changes.

## Known limitations

- Damage values are derived from the entity health you can see locally. Absorbed damage and delayed server-side health updates can throw the numbers off slightly.
- The mace range helper shows the nearest entity, not necessarily the one you are aiming at.

## Credits

Original mod by ViratS-best: [Attribute PVP Helper on Modrinth](https://modrinth.com/project/D7LBHzLK) – source on [GitHub](https://github.com/ViratS-best/HackCraft-Real).

Maintained by henrymmey.

## License

MIT License. See [LICENSE](LICENSE).

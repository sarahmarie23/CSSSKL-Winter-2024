/**
 * Defines a contract for entities that have the ability to attack.
 */
public interface Attackable {
    /**
     * Attacks a target.
     * @param target The target to attack.
     */
    void attack(Object target);

    /**
     * Attacks a target with an enchanted weapon.
     * @param target The target to attack.
     * @param enchantment The type of enchantment.
     */
    //void attack(Object target, String enchantment);
}

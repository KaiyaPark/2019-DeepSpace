package frc.team3647subsystems;

public class StateLogic
{
    //Combined Elevator and Arm System
    public static void startPositionBall()
    {
        /*
        The ball has not been picked up yet, the ball intake and ball carrier are both empty.
        Elevator: mid
        Wrist: 0 deg
        Intake: retracted
        Shoot: retracted
        BSensor: false
        */
    }
    public static void intakeBall()
    {
        /*
        The ball is being picked up and the ball intake has a ball, and the ball carrier is empty.
        At this state, the robot is ready for intake but the process must be mostly done manually
        Elevator: low
        Wrist: 0 deg
        Intake: extracted
        Shoot: retracted
        BSensor: false
        */
    }
    public static void hasBall()
    {
        /*
        The ball is loaded in the carrier and is ready to score. 
        Elevator: low
        Wrist: 0 deg
        Intake: retracted
        Shoot: retracted
        BSensor: true
        */
    }
    public static void scoreLowBallF()
    {
        /*
        The ball is being scored at the lowest elevator level from the front
        Elevator: low
        Wrist: 0 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreLowBallB()
    {
        /*
        The ball is being scored at the lowest elevator level from the back
        Elevator: low
        Wrist: 180 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreMidBallF()
    {
        /*
        The ball is being scored at the middle elevator level from the front
        Elevator: mid
        Wrist: 0 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreMidBallB()
    {
        /*
        The ball is being scored at the middle elevator level from the back
        Elevator: mid
        Wrist: 180 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreHighBallF()
    {
        /*
        The ball is being scored at the highest elevator level from the front
        Elevator: high
        Wrist: 0 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreHighBallB()
    {
        /*
        The ball is being scored at the highest elevator level from the back
        Elevator: high
        Wrist: 180 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreCargoBallF()
    {
        /*
        The ball is being scored at the cargo elevator level from the front
        Elevator: cargo
        Wrist: 0 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
    public static void scoreCargoBallB()
    {
        /*
        The ball is being scored at the cargo elevator level from the back
        Elevator: cargo
        Wrist: 180 deg
        Intake: retracted
        Shoot: extracted
        BSensor: true
        */
    }
}
